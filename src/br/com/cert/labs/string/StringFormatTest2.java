package br.com.cert.labs.string;

public class StringFormatTest2 {

	public static void main(String[] args) {
		
		/*
		
			%[arg_index$][flags][width][.precision]conversion_char
		
		*/
		
		System.out.printf("\"%-5c\"", 'c');
		System.out.println();
		System.out.printf("\"$%(,9.2f\"", -1222.2);
		System.out.println();
		System.out.printf("%b", 100);
		System.out.println();
		System.out.printf("\"%c\"", new Character('d'));
		System.out.println();
		System.out.printf("%s", new Object());
		System.out.println();
		
		/*
		System.out.printf("\"%+0d\"",100);
		System.out.printf("\"%f\"", -100);
		*/
		
	}

}
