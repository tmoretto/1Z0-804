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

	/*
	public void m6(ArrayList<Shape> strList) {
		List<? extends Shape> list = new ArrayList<>();
		list.add(new Shape());
		strList.addAll(list);
	}
	*/

}
