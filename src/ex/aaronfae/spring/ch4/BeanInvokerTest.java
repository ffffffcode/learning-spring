package ex.aaronfae.spring.ch4;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInvokerTest {

	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-annotation.xml");
	}

	@Test
	public void testSay() {
		BeanInvoker beanInvoker = (BeanInvoker) context.getBean("beanInvoker");
		beanInvoker.say();
	}

}
