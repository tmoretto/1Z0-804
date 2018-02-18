package br.com.cert.labs.basics;

public class SizesTest {

	public static void main(String[] args) {
		
		byte b1 = 127;
		//byte b2 = 128; //compile error
				
		short s1 = 128;
		//short s2 = 100000; //compile error
		
		int i1 = 100000;
		//int i2 = 10000000000; //compile error

		long l1 = 100000;
		//long l2 = 10000000000; //compile error
	}

}
