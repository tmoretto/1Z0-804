package br.com.cert.labs.classdesign;

class SuperBase {}
class Base extends SuperBase {}
class Derived extends Base {}

public class ClassArrayTest {

	public static void main(String[] args) {
		SuperBase[] s1 = new Base[2];
		
		//SuperBase[] s2 = new Derived[1] {new Derived()}; //compile error, should not specify the size 
		SuperBase[] s2 = new Derived[] {new Derived()}; 
		
		Base[] b1 = new Derived[0];
		Derived[] d1 = (Derived[])s2;
		
		Base[] b3 = d1;
		
		s1 = b1;
		
		
		int[] data1 = new int[10];
		// or
		int[] data2 = {10,20,30,40,50,60,71,80,90,91};
		// or
		int[] data3 = new int[] {10,20,30,40,50,60,71,80,90,91};
		//wrong
		//int[] data4 = new int[10] {10,20,30,40,50,60,71,80,90,91};
	}

}
