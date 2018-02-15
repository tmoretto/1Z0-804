package br.com.cert.labs.classdesign;

interface IX {
	void foo2();
} 

public class PrivateStaticTest {

	private static int qtde = 100;
	private static class ClasseEstatica implements IX {
		public void foo2() {
			System.out.println("foo static");
		}
	}
	
	private class ClassePrivada implements IX {
		public void foo2() {
			System.out.println("foo privada");
		}
	} 
	
	public void foo1() {
		System.out.println("foo");
	}
	
	public static void main(String[] args) {
		new PrivateStaticTest().teste();
	}
	
	public void teste() {
		this.foo1();
		PrivateStaticTest.qtde = 100;
		
		new ClasseEstatica().foo2();
		new PrivateStaticTest().new ClassePrivada().foo2();
	}
	
	
	
	
}
