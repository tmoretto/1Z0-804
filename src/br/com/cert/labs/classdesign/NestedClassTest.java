package br.com.cert.labs.classdesign;

class A {
	
	static class SA {
		
	}
	
	class AA {
		
		class AAA {
			
		}
	}
}

class B extends A {}

public class NestedClassTest {

	public static void main(String[] args) {
		
		A.AA aa = new A().new AA();
		A.AA.AAA aaa = new A().new AA().new AAA();

		
		A.SA sa = new A.SA();
		
		
		
	}

}
