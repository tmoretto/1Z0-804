package br.com.cert.labs.basics;

public class OverloadTest {
	
	public static void main(String[] args) {
		System.out.println(foo(350000000));
	}

	static String foo(byte a) {
		return "byte";
	}

	static String foo(short a) {
		return "short";
	}

	/*
	static String foo(int a) {
		return "int";
	}
	*/

	static String foo(Integer a) {
		return "Integer";
	}
	
	static String foo(long a) {
		return "long";
	}

	static String foo(float a) {
		return "float";
	}

	static String foo(double a) {
		return "double";
	}
}
