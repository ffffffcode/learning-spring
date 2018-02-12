package ex.aaronfae.spring.ch4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
// @Component
@Component("bean")
public class BeanAnnotation {

	public void say() {
		System.out.println("BeanAnnotation: " + this.hashCode());
	}

}
