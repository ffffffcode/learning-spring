package ex.aaronfae.spring.ch4;

public class StringStore implements Store {

	public void init() {
		System.out.println("init operation");
	}

	public void destroy() {
		System.out.println("destroy operation");
	}

}
