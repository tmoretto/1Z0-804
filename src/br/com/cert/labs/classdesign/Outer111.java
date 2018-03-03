package br.com.cert.labs.classdesign;

public class Outer111 {

	int i = 10;

	class Inner {
		public void methodA() {
			System.out.println(i);
			System.out.println(Outer111.this.i);
		}
	}

	public static void main(String[] args) {
		new Outer111().new Inner().methodA();

	}

}
