package br.com.cert.labs.assertion;

public class AssertionErrorTest {

	static void testAssertionError() throws Error {
		if (true) throw new AssertionError();
		System.out.println("test Assertion Error");
	}
	
	public static void main(String[] args) {
		
		try {
			testAssertionError();
		} catch (Exception e) {
			System.out.println("exception is thrown");
		}
		System.out.println("end of the show...");

	}

}
