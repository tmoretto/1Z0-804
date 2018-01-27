package br.com.cert.labs.classdesign;

public class StaticOrderTest {

	private static int x = getValue();
	private static int y = 5;
	private static int z = getValue();

	private static int getValue() {
		return y;
	}

	public static void main(String[] args) {
		System.out.println(x); //prints 0
		System.out.println(z); //prints 5
	}

}
