package ex.aaronfae.spring.ch2;

public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String str) {
		System.out.println("ģ�����ݿⱣ�棺����" + str);
	}

}
