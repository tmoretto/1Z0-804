package br.com.cert.labs.generics;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class GTypesTest {

	public static void main(String[] args) {
		List<?> l = new Vector<String>();
		Set<String> s = new LinkedHashSet<String>();
	}

}
