package br.com.cert.labs.classdesign;

public class StaticOrderTest {

	private static int x = getValue();
	private static int y = 5;

	private static int getValue() {
		return y;
	}

	public static void main(String[] args) {
		System.out.println(x); //prints zero
	}

}
