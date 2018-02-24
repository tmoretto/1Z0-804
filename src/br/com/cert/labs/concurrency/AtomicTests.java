package br.com.cert.labs.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTests {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(0);
		System.out.println(ai.incrementAndGet());
		System.out.println(ai.getAndIncrement());
		System.out.println(ai);
		System.out.println();
		System.out.println(ai.addAndGet(1));
		System.out.println(ai.getAndAdd(1));
		System.out.println(ai);
	}

}
