package br.com.cert.labs.basics;

import java.io.File;

public class PrintsTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("8");
		File f = new File("xpto");
		
		String s = "8";
		Integer i = 8;
		System.out.println(8 + i + s); // 168
		System.out.println(8 + s + i);
		
		//System.out.println(8 + i + sb);
		System.out.println(8 + i + sb.toString());
		
		
	}

}
