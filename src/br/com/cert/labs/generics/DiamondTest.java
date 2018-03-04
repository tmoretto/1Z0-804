package br.com.cert.labs.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DiamondTest {

	public static void main(String[] args) {
		Map<?, List<String>> t = new TreeMap<Integer, List<String>>();
		Map<? , List<String>> box = new HashMap<String, List<String>>();
		List<?> l = new ArrayList<String>();
	}

}
