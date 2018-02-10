package ex.aaronfae.spring.ch2;

public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String str) {
		System.out.println("模拟数据库保存：保存" + str);
	}

}
