package br.com.cert.labs.basics;

public class DivisionTest {

	public static void main(String[] args) {
		int i = 1;
		try {
			for (; true; i--) {
				if (i / --i <= 0)
					break;
			}
		} catch (ArithmeticException e) {
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}

	}

}
