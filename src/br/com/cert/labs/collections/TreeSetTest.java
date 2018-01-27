package br.com.cert.labs.collections;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Collection<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("XML");
		set.add("Swing");
		set.add("JSP");
		set.add("Java");
		
		for (Object o : set) {
			System.out.println(o + " ");
		}
		
		Collection<Number> setN = new TreeSet<Number>();
		setN.add(1);
		setN.add(5);
		setN.add(3);
		setN.add(1);
		setN.add(2);
		
		for (Object o : setN) {
			System.out.println(o + " ");
		}

	}

}
