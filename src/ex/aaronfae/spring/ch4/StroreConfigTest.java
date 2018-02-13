package ex.aaronfae.spring.ch4;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StroreConfigTest {

	private static ClassPathXmlApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-annotation.xml");
	}

	@Test
	public void testGetDriverManager() {
		((MyDriverManager) context.getBean("driverManager")).show();
	}

	@Test
	public void testGetStringStore() {
		StringStore s1 = (StringStore) context.getBean("stringStore");
		System.out.println(s1.getClass().getName() + " " + s1.hashCode());
		StringStore s2 = (StringStore) context.getBean("stringStore");
		System.out.println(s2.getClass().getName() + " " + s2.hashCode());
		context.close();
	}

}
