package ex.aaronfae.spring.ch4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanAutowiredServiceImpl implements BeanAutowiredService {

	// @Autowired
	private BeanAutowiredDAO beanAutowiredDAO;

	/*
	 * @Autowired public void setBeanAutowiredDAO(BeanAutowiredDAO beanAutowiredDAO)
	 * { this.beanAutowiredDAO = beanAutowiredDAO; }
	 */

	public BeanAutowiredServiceImpl() {
	}

	@Autowired
	public BeanAutowiredServiceImpl(BeanAutowiredDAO beanAutowiredDAO) {
		this.beanAutowiredDAO = beanAutowiredDAO;
	}

	@Override
	public void save(String str) {
		System.out.println("从客户中收到的数据是：" + str);
		str = str + this.hashCode();
		beanAutowiredDAO.save(str);
	}

}
