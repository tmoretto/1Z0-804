package br.com.cert.labs.string;

public class PrintfOrderTest {

	public static void main(String[] args) {
		System.out.printf("%1$2s %1$2s %<s", "A", "B", "C");
		System.out.println();
		
		System.out.printf("%1$s %1$s %s", "A", "B", "C");
		System.out.println();
		System.out.printf("%1$s %s %s", "A", "B", "C");
		System.out.println();
		System.out.printf("%s %s %2$s", "A", "B", "C");
		System.out.println();

		System.out.printf("%1$s %1$s %<s", "A", "B", "C");
		System.out.println();
		System.out.printf("%3$s %<s %<s", "A", "B", "C");
		System.out.println();
		System.out.printf("%1$s %<s %s", "A", "B", "C");
		System.out.println();
	}

}
