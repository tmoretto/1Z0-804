package br.com.cert.labs.threads;

public class AnnoRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("rodando thread");
		    }
		});

		t.start();
	}

}
