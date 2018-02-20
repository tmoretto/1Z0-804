package br.com.cert.labs.generics;

import java.util.List;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class UpDownCastsTest {

	public static void main(String[] args) {
		
	}
	
	public void foo(List<? extends A> list) {
		
		Object o = list.get(0);
		A a = list.get(0);
		B b = list.get(0);
		C c = list.get(0);
		D d = list.get(0);
		
		list.add(new A());
		list.add(new B());
		list.add(new C());
		list.add(new D());
		
	}

	public void boo(List<? super A> list) {
		
		Object o = list.get(0);
		A a = list.get(0);
		B b = list.get(0);
		C c = list.get(0);
		D d = list.get(0);

		list.add(new A());
		list.add(new B());
		list.add(new C());
		list.add(new D());
		
	}
}
