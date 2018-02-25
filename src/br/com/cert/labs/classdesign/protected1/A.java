package br.com.cert.labs.classdesign.protected1;

public class A {

	protected int i = 10;

	public int getI() {
		return i;
	}

}

class C extends A {
	
	public void process(A a) {
		a.i = a.i * 2;
	}
	
}
