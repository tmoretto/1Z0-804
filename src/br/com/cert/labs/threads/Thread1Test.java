package br.com.cert.labs.threads;

public class Thread1Test {

	private static class CStore implements Runnable {

		Integer cps = 10;

		@Override
		public void run() {
			while (cps > 0) {
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
					System.out.println(e);
				}

				synchronized (this) {
					cps -= 1;

				}
				System.out.println(cps);
			}

		}

	}

	public static void main(String[] args) {
		CStore cs = new CStore();

		Thread t1 = new Thread(cs);
		Thread t2 = new Thread(cs);

		t1.start();
		t2.start();

	}

}
