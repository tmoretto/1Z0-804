package br.com.cert.labs.threads;

class AA extends Thread {
	
	public void run() {
		System.out.println("Starting loop");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("loop Interrupted");
			e.printStackTrace();
		}
		while (!isInterrupted()) {};
		System.out.println("Ending loop");
	}
	
}

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		AA a = new AA();
		a.start();
		Thread.sleep(1000);
		a.interrupt();
	}

}
