package ex.aaronfae.spring.ch3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanResourceTest {

	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-resource.xml");
	}

	@Test
	public void testResource() {
		((BeanResource) context.getBean("beanResource")).resource();
	}

}
