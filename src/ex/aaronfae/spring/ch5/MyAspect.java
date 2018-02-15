package ex.aaronfae.spring.ch5;

public class MyAspect {

	public void monitor() {
		System.out.println("doMonitor");
	}

	public void doAccessCheck() {
		System.out.println("doAccessCheck");
	}

	public void doRecoveryActions() {
		System.out.println("doRecoveryActions");
	}

	public void doReleaseLock() {
		System.out.println("doReleaseLock");
	}

}
