package br.com.cert.labs.generics;

import java.util.List;
import java.util.Vector;

public class GenTest1 {

	public static void main(String[] args) {
		List<? extends Object> aList = new Vector<String>();
		//aList.add("USA"); // COMPILE ERROR
		testA(aList);
		testA(new Vector<String>());
		
		List<? extends Number> bList = new Vector<Integer>();
		//bList.add(1); // COMPILE ERROR
		testB(bList);
		testB(new Vector<Integer>());
		testB(new Vector<Float>());
		
	}
	
	public static void testA(List<? extends Object> aList) {
	}
	
	public static void testB(List<? extends Number> bList) {
	}

	
	
}
