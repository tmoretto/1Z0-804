package br.com.cert.labs.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{

	public String call() throws Exception {
		Thread.sleep(5000);
		return "DONE";
	}

}

public class FutureTestClass {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> future = es.submit(new MyCallable());
		System.out.println(future.get());
		es.shutdownNow();

	}

}

