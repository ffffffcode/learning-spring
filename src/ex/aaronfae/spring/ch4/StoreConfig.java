package ex.aaronfae.spring.ch4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("config.xml")
public class StoreConfig {

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean(name = "driverManager")
	public MyDriverManager getDriverManager() {
		return new MyDriverManager(url, username, password);
	}

	@Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
	@Scope("singleton")
	public Store getStringStore() {
		return new StringStore();
	}

}
