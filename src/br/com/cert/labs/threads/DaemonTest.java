package br.com.cert.labs.threads;

public class DaemonTest extends Thread {

	public void run() {
		System.out.println("rodando");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rodou");
	}
	
	public static void main(String[] args) {
		Thread t = new DaemonTest();
		
		t.start();
		t.setDaemon(true);
		
	}

}
