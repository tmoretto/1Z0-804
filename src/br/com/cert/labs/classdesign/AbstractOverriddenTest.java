package br.com.cert.labs.classdesign;

class A {}
class B extends A {}

abstract class AbstractTest {
	static int i;

	abstract Object test();
	
	abstract void test(Object o);
	
	abstract Number testN();

	abstract A testAB();
	
	abstract void testAB(A a);

	public AbstractTest() {
		System.out.println("A");
	}
}

public class AbstractOverriddenTest extends AbstractTest {

	Integer test() {
		return i;
	}
	
	void test(Object o) {
		System.out.println("Object");
	}

	void test(String o) {
		System.out.println("String");
	}
	
	Integer testN() {
		return i;
	}
	
	B testAB() {
		return new B();
	}
	
	void testAB(A a) {
		System.out.println("A");
	}

	void testAB(B a) {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		AbstractOverriddenTest t = new AbstractOverriddenTest();
		System.out.println(t.test());
	}

}
