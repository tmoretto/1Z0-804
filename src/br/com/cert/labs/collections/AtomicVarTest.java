package br.com.cert.labs.collections;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVarTest implements Runnable {

	int x = 1;
	private AtomicInteger cps = new AtomicInteger(10);
	
	@Override
	public void run() {
		while (x > 0) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			//System.out.println(Thread.currentThread().getName() + " b " + cps);
			synchronized (this) {
				x = cps.decrementAndGet();
				System.out.println(Thread.currentThread().getName() + " - " + cps);
			}
			//System.out.println(Thread.currentThread().getName() + " a " + cps);
		}

	}

	public static void main(String[] args) {
		AtomicVarTest atv = new AtomicVarTest();
		
		Thread t1 = new Thread(atv, "t1");
		Thread t2 = new Thread(atv, "t2");
		
		t1.start();
		t2.start();

	}

}
