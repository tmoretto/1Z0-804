package br.com.cert.labs.collections;

public class SpecialPicker<K> {

	public K pickOne(K k1, K k2) {
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		
		return k1.hashCode() > k2.hashCode() ? k1 : k2;
	}
	
	public static void main(String[] args) {
		SpecialPicker<Integer> sp = new SpecialPicker<>();
		System.out.println(sp.pickOne(441, 244).intValue()+1);

	}

}
