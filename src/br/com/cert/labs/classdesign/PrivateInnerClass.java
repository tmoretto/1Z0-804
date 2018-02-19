package br.com.cert.labs.classdesign;

class Outer {
	
	public void foo() {
		Inner i = new Inner();
		i.reason = "i";
	}
	
	private class Inner {
		private String reason = "none";
	}
}

public class PrivateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
