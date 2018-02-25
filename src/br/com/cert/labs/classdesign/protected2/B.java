package br.com.cert.labs.classdesign.protected2;

import br.com.cert.labs.classdesign.protected1.A;

public class B extends A {
/*
	public void process(A a) {
		a.i = a.i * 2;
	}
	*/
	public void process(B a) {
		a.i = a.i * 2;
	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		b.process(b);
		System.out.println(b.getI());
	}

}
