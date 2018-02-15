package br.com.cert.labs.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TestT<E> {
	List<E> l3 = new ArrayList<E>();
}

public class WarningTest {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		List<Object> l1 = new LinkedList<Object>();

	}

}
