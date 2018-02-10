package ex.aaronfae.spring.ch3;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopePrototypeTest {

	private static ApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-beanscope.xml");
	}

	@Test
	public void testSay() {
		BeanScopePrototype b1 = (BeanScopePrototype) context.getBean("beanScopePrototype");
		System.out.print("b1");
		b1.say();

		b1 = (BeanScopePrototype) context.getBean("beanScopePrototype");
		System.out.print("b1");
		b1.say();

		BeanScopePrototype b2 = (BeanScopePrototype) context.getBean("beanScopePrototype");
		System.out.print("b2");
		b2.say();
	}

}
