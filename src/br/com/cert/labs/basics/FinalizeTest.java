package br.com.cert.labs.basics;

class SuperFinalize {
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Super");
	}
}

public class FinalizeTest {

	String s = "abc";
	
	public static void main(String[] args) throws Throwable {
		FinalizeTest ft = new FinalizeTest();
		ft.finalize();
	}

}
