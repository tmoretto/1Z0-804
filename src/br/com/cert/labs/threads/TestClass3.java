package br.com.cert.labs.threads;

class A3 extends Thread {

	public void run() {
		System.out.println("Starting loop");
		for (int i = 0; i <= 50000; i++) {
			if (!isInterrupted()) {
				System.out.println(i);
			}
		}
		System.out.println("Ending loop");
	}

}

public class TestClass3 {

	public static void main(String[] args) throws InterruptedException {
		A3 a = new A3();
		a.start();
		Thread.sleep(100);
		a.interrupt();
		System.out.println("Interrupted!!!!");
	}

}
