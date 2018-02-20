package br.com.cert.labs.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface I<A,B> {
	
	void setA(A a);
	
	void setB(B b);
}

class Z {}

public class ClassTest<A, B> {

	private A a;
	private B b;
	
	public void print() {
		System.out.println(a.toString() + " | " + b.toString()); 
	}
	
	public static void main(String[] args) {
		ClassTest<Integer, String> t1 = new ClassTest<>();
		t1.setA(10);
		t1.setB("Dez");
		t1.print();
		
		
		ClassTest<String, Double> t2 = new ClassTest<>();
		t2.setA("Cinquenta e cinco ponto um");
		t2.setB(55.1);
		t2.print();
		
		
		String[] p = {"1", "2", "3"};
		List<?> asList = new ArrayList<>(Arrays.asList(p));
		
		
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
