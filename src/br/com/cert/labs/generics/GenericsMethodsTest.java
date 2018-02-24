package br.com.cert.labs.generics;

import java.util.ArrayList;
import java.util.List;

class Shape {
}

public class GenericsMethodsTest {

	public static void main(String[] args) {

	}

	/*
	public List<Shape> m3(ArrayList<? extends Shape> strList) {
		List<? extends Shape> list = new ArrayList<>();
		list.addAll(strList);
		return list;
	}
	*/
	
	public List<? extends Shape> m4(List<? extends Shape> strList) {
		List<Shape> list = new ArrayList<>();
		list.add(new Shape());
		list.addAll(strList);
		return list;
	}

	public void m5(ArrayList<? extends Shape> strList) {
		List<Shape> list = new ArrayList<>();
		list.add(new Shape());
		list.addAll(strList);
		
	}
	
	public void m0(List<? super Number> list) {
		Number n1 = 10;
		list.add(n1);
		new ArrayList<Object>().add(n1);
		new ArrayList<Number>().add(n1);
		
		Number n2 = list.get(0);
	}

	public void m1(List<? extends Number> list) {
		Number n1 = 10;
		//list.add(n1); //COMPILER DOENST KNOW TYPE
		new ArrayList<Integer>().add(n1);
		
		Number n2 = list.get(0);
	}
	
	public void m2(List<? extends Object> list) {
		Object n = list.get(0);
		//list.add(n); //COMPILER DOENST KNOW TYPE 
		
	}
	
	/*
	public void m1(List<Number extends ?> n) { // NEVER LIKE THIS
		
	}*/

	/*
	public void m6(ArrayList<Shape> strList) {
		List<? extends Shape> list = new ArrayList<>();
		list.add(new Shape());
		strList.addAll(list);
	}
	*/

}
