package br.com.cert.labs.basics;

public class BooleanIniTest {

	public static void main(String[] args) {
		Boolean b1 = new Boolean("t");
		Boolean b2 = new Boolean("tRuE");
		Boolean b3 = new Boolean("1");
		Boolean b4 = new Boolean(" ");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
