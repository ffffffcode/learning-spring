package ex.aaronfae.spring.ch4;

import org.springframework.stereotype.Repository;

@Repository
public class BeanAutowiredDAOImpl implements BeanAutowiredDAO {

	@Override
	public void save(String str) {
		System.out.println("ģ�����ݿⱣ�棺����" + str);
	}

}
