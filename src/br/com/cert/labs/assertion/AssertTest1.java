package br.com.cert.labs.assertion;

public class AssertTest1 {

	public static void main(String[] args) {
		float f1 = Float.NaN;
		float f2 = f1;
		float f3 = 1.2f;
		
		double d1 = Double.NaN;
		
		try {
			assert (f2 == f1) :	f2 = 2;
			f3 = 1.5f;
		} catch (AssertionError ae) {
			f3++;
		}
		
		f3 += f2;
		System.out.println("f3 = " + f3);
		
	}

}
