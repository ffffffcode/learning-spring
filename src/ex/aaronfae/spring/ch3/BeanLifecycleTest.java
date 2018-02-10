package ex.aaronfae.spring.ch3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {

	private static ClassPathXmlApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-beanlifecycle.xml");
	}

	@Test
	public void test() {
		context.start();
		context.destroy();
	}

}
