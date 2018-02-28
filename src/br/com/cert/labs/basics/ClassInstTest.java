package br.com.cert.labs.basics;

interface A {
	void foo();
}

class B {
	public void boo() {
		System.out.println("bbbb b");
	}
}

public class ClassInstTest {

	public static void main(String[] args) {

		A a = new A() {
			public void foo() {
				System.out.println("aaaa 1");
			}
		};
		a.foo();

		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("aaaa 2");
			}
		});
		t.start();

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("aaaa 3");
			}
		};
		t2.start();

		new Thread() {
			public void run() {
				System.out.println("aaaa 4");
			}
		}.start();

		B b1 = new B();
		b1.boo();
		
		B b2 = new B() {
			public void boo() {
				System.out.println("bbbb mb");
			}
		};
		b2.boo();
		
	}

}
