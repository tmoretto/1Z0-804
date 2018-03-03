package br.com.cert.labs.string;

public class StringBuilderTEst {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(8);
		System.out.println(8+sb.toString());
		
		sb = new StringBuilder("8");
		System.out.println(8+sb.toString());
	}

}
