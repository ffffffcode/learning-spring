package ex.aaronfae.spring.ch2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTest {

	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-injection.xml");
	}

	@Test
	public void Test() {
		InjectionService service = (InjectionServiceImpl) context.getBean("injectionService");
		service.save("username:af");
	}

}
