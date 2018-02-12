package ex.aaronfae.spring.ch3;

public class AutoWiringService {

	private AutoWiringDAO autoWiringDAO;

	public AutoWiringService() {
	}

	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}

	public void say() {
		autoWiringDAO.say("AutoWiringService");
	}
}
