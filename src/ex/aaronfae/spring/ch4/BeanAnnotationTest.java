package ex.aaronfae.spring.ch4;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationTest {

	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-annotation.xml");
	}

	@Test
	public void testSay() {
		// 默认id为首字母小写的类名
		/*
		 * BeanAnnotation beanAnnotation
		 * =(BeanAnnotation)context.getBean("beanAnnotation");
		 */
		BeanAnnotation b1 = (BeanAnnotation) context.getBean("bean");
		b1.say();
		BeanAnnotation b2 = (BeanAnnotation) context.getBean("bean");
		b2.say();
	}

}
