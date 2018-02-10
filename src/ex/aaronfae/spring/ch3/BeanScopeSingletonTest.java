package ex.aaronfae.spring.ch3;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSingletonTest {

	private static ApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-beanscope.xml");
	}

	@Test
	public void testSay() {
		BeanScopeSingleton b1 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b1");
		b1.say();

		b1 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b1");
		b1.say();

		BeanScopeSingleton b2 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b2");
		b2.say();
	}

	@Test
	public void testSay2() {
		BeanScopeSingleton b1 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b1");
		b1.say();

		b1 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b1");
		b1.say();

		BeanScopeSingleton b2 = (BeanScopeSingleton) context.getBean("beanScopeSingleton");
		System.out.print("b2");
		b2.say();
	}

}
