package br.com.cert.labs.classdesign;

class SuperTest {
	int f() {
		return 0;
	}
}

public class OverrindingTest extends SuperTest {

	int i;

	protected int f() throws Error {
		return i;
	}

	OverrindingTest(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		
		SuperTest t = new OverrindingTest(5);
		System.out.println(t.f());

	}

}
