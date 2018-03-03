package br.com.cert.labs.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

	public static void main(String[] args) {
		NavigableSet<String> myset = new TreeSet<>();
		myset.add("a");
		myset.add("b");
		myset.add("c");
		myset.add("aa");
		myset.add("bb");
		myset.add("cc");
		myset.add("AA");
		myset.add("A");
		myset.add("1");
		myset.add("111");
		myset.add("5");
		myset.add("9");
		myset.add("10");
		myset.add("010");
		myset.add(" ");
		myset.add("','");
		myset.add("'.'");
		myset.add("':'");
		myset.add("';'");
		myset.add("%");
		
		System.out.println(myset);
		
		System.out.println(myset.floor("a"));
		System.out.println(myset.ceiling("aaa"));
		System.out.println(myset.lower("a"));
		System.out.println(myset.higher("bb"));

	}

}
