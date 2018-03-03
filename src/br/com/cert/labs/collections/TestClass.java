package br.com.cert.labs.collections;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
		Set<String> holder = new TreeSet<String>();
		holder.add("tom");
		holder.add("dick");
		holder.add("harry");
		holder.add("tom");
		printIt(holder);
	}

	private static void printIt(Collection<String> holder) {
		for (String string : holder) {
			System.out.println(string);
		}
		
	}

}
