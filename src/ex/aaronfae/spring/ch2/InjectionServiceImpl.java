package ex.aaronfae.spring.ch2;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String str) {
		System.out.println("�ӿͻ����յ��������ǣ�" + str);
		str = str + this.hashCode();
		injectionDAO.save(str);
	}

}
