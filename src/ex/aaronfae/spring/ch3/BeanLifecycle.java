package ex.aaronfae.spring.ch3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycle implements InitializingBean, DisposableBean {

	public void init() {
		System.out.println("BeanLifecycle init-method");
	}

	public void dest() {
		System.out.println("BeanLifecycle destroy-method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanLifecycle afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BeanLifecycle destroy()");
	}

	public void defaultInit() {
		System.out.println("BeanLifecycle default-init-method");
	}

	public void defaultDestroy() {
		System.out.println("BeanLifecycle default-destroy-method");
	}

}
