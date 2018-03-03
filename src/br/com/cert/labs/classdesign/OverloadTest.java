package br.com.cert.labs.classdesign;

public class OverloadTest {

	void probe(Integer... x) {
		System.out.println("In Integer...");
	}

	void probe(Integer x) {
		System.out.println("In Integer");
	}

	void probe(Object x) {
		System.out.println("In Object");
	}

	void probe(Long x) {
		System.out.println("In Long");
	}

	public static void main(String[] args) {
		int a = 10;
		int[] aa = { 10, 20 };
		long l = 30;
		
		new OverloadTest().probe(a);
		new OverloadTest().probe(aa);
		new OverloadTest().probe(l);
		
	}

}
