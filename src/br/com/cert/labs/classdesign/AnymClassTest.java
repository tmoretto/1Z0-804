package br.com.cert.labs.classdesign;

interface I {
	String foo(String string); 
}

public class AnymClassTest {

	public static void main(String[] args) {
		
		String s = "Any";
		
		I t1 = new I() {
			private String s1 = " 1";
			public String foo(String string) {
				return string + s1;
			}
		};
		System.out.println(t1.foo(s)); 
		
		I t2 = new I() {
			private String s2 = " 2";
			public String foo(String string) {
				return string + s2;
			}
		};
		System.out.println(t2.foo(s)); 
		
	}

}
