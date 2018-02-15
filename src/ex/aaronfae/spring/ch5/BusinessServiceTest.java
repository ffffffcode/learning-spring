package ex.aaronfae.spring.ch5;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusinessServiceTest {

	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-aspect-schema.xml");
	}

	@Test
	public void testSay() {
		BusinessService businessService = (BusinessService) context.getBean("businessService");
		businessService.say();
	}

}
