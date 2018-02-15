package ex.aaronfae.spring.ch5;

public class BusinessService {

	public void say() {
		System.out.println("BusinessService: error");
		throw new RuntimeException();
	}

}
