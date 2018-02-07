package br.com.cert.labs.classdesign;

interface E {
	String getX();
}

enum EnumI implements E {
	
	EA {
		public String getX() {
			return "EA";
		}
	},
	EB,
	EC,
	ED;
		
	public String getX() {
		return "Others";
	}
	
}

public class EnumTest {
	
	public static void main(String args[]) {
		System.out.println(EnumI.EA.getX());
		System.out.println(EnumI.ED.getX());
	}

}