package br.com.cert.labs.classdesign;

import java.math.BigDecimal;

public class AmbiguousMethodTest {

	public void myMethod(String s) {
		System.out.println("My String " + s);
	}
	
	public void myMethod(StringBuffer sb) {
		System.out.println("My StringBuffer " + sb);
	}

	public void myMethod(Object o) {
		System.out.println("My Object " + o);
	}

	public void myMethod(Number n) {
		System.out.println("My Number " + n);
	}
	
	public void myMethod(Integer i) {
		System.out.println("My Integer " + i);
	}

	public void myMethod(int i) {
		System.out.println("My int " + i);
	}
	
	public void myMethod(Double d) {
		System.out.println("My Double " + d);
	}
	
	public void myMethod(float f) {
		System.out.println("My float " + f);
	}
	
	public void myMethod(Float f) {
		System.out.println("My Float " + f);
	}
	
	public static void main(String[] args) {
		AmbiguousMethodTest t = new AmbiguousMethodTest();
		
		t.myMethod("S"); //String
		t.myMethod(new StringBuffer("SB")); //StringBuffer
		
		t.myMethod('A'); //'A' == 65, so int		
		t.myMethod(1); //int
		t.myMethod(new Integer(1)); //Integer
		
		t.myMethod(1.5f); //float
		t.myMethod(new Float(1.5f)); //Float
		
		t.myMethod(BigDecimal.ONE); //Number
		
		//t.myMethod(null); //ambiguous, so compile error

	}

}
