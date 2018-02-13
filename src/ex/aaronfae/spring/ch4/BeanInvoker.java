package ex.aaronfae.spring.ch4;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

	@Autowired
	private List<BeanInterface> list;

	@Autowired
	private Map<String, BeanInterface> map;

	// @Autowired
	// @Qualifier("beanTweImpl")
	private BeanInterface beanInterface;

	public BeanInvoker(@Qualifier("beanTweImpl") BeanInterface beanInterface) {
		this.beanInterface = beanInterface;
	}

	public void say() {
		if (null != list) {
			System.out.println("list...");
			for (BeanInterface beanInterface : list) {
				System.out.println(beanInterface.getClass().getName());
			}
		} else {
			System.out.println("list is null!!!!!!!!");
		}

		if (null != map) {
			System.out.println("map...");
			for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "    " + entry.getValue().getClass().getName());
			}
		} else {
			System.out.println("map is null!!!!!!!!");
		}

		if (null != beanInterface) {
			System.out.println("beanInterface...");
			System.out.println(beanInterface.getClass().getName());
		} else {
			System.out.println("beanInterface is null!!!!!!!!");
		}
	}

}
