package br.com.cert.labs.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarningsTest {

	public static void main(String[] args) {

		Map<String, List<String>> myMap1 = new HashMap<String, List<String>>();
		Map<String, List<String>> myMap2 = new HashMap<>();
		Map<String, List<String>> myMap3 = new HashMap();
		//Map<> myMap4 = new HashMap(); //erro

		List<String> myList1 = new ArrayList<String>();
		List<String> myList2 = new ArrayList<>();
		List<String> myList3 = new ArrayList();
		//List<> myList4 = new ArrayList(); //erro

	}

}
