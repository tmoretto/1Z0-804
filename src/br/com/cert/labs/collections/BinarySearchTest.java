package br.com.cert.labs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest implements Comparator {

	public static void main(String[] args) {
		 String[] sa = { "d", "bbb", "aaaa" };
		 System.out.println(Arrays.binarySearch(sa, "c", new BinarySearchTest())); 
		 System.out.println(Arrays.binarySearch(sa, "cc", new BinarySearchTest()));
		 
		 List<String> list = new ArrayList<>();
		 list.add("d");
		 list.add("bbb");
		 list.add("aaa");

		 System.out.println(Collections.binarySearch(list, "c", new BinarySearchTest()));
		 System.out.println(Collections.binarySearch(list, "cc", new BinarySearchTest()));
	}

	@Override
	public int compare(Object o1, Object o2) {
		int s1 = ((String) o1).length();
		int s2 = ((String) o2).length();
		return s1 - s2;
	}

}
