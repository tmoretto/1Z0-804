package br.com.cert.labs.collections;

import java.util.NavigableMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapTest {

	public static void main(String[] args) {
		ConcurrentNavigableMap myMap = new ConcurrentSkipListMap();
		myMap.put("ab", 10);
		myMap.put("cd", 5);
		myMap.put("ca", 30);
		myMap.put("c", 30);
		myMap.put("az", 20);
		
		NavigableMap myMap2 = myMap.tailMap("c", true);
		System.out.println(myMap.size() + " " + myMap2.size());
		
	}

}
