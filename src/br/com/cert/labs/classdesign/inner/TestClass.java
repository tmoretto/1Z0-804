package br.com.cert.labs.classdesign.inner;

import br.com.cert.labs.classdesign.Outer111;

public class TestClass {
	static int si = 10;
	int ii = 20;
	private double d = 10.0;

	public void inner() {
		int ai = 30; // automatic variable
		final int fai = 40; // automatic final variable
		
		class Inner {
			public Inner() {
				System.out.println(si + "  " + ii + "   " + fai + fai2);
			}
		}
		new Inner();
		final int fai2 = 40; // automatic final variable
	}

	
	public static void staticInner() {
		int ai = 30; // automatic variable
		final int fai = 40; // automatic final variable
		
		class Inner {
			public Inner() {
				System.out.println(si + "  " + ii + "   " + fai + fai2);
			}
		}
		new Inner();
		final int fai2 = 40; // automatic final variable
	}
	
	class Inner2 {
		
		int iii;
		
		public void methodA() {
			System.out.println(si + "  " + ii + "   " + this.iii + TestClass.this.ii);
		}
				
	}

	abstract class Inner3 {
		
		int iii;
		
		public void methodA() {
			System.out.println(si + "  " + ii + "   " + this.iii + TestClass.this.ii);
		}
				
	}
	
	static class Inner4 {
		
		int iii;
		
		public void methodA() {
			TestClass o = new TestClass();
			System.out.println(si + "  " + o.d + "   " + this.iii);
		}
				
	}
	public static void main(String[] args) {
		new TestClass().inner();
	}

}
