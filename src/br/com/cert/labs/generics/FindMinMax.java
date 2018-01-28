package br.com.cert.labs.generics;

public class FindMinMax <N extends Number> {
	
	private N a,b;
	
	public N findMin() { return a;}
	public N findMax() { return b;}
	
	public void add(N added) {
		if (a == null || added.doubleValue() < a.doubleValue())
			a = added;
		if (b == null || added.doubleValue() > b.doubleValue())
			b = added;
	}

	
	public static void main(String[] args) {
		Integer i = 0;
		Number n = 0;
		
		FindMinMax<Integer> f1 = new FindMinMax<>();
		FindMinMax<Number> f2 = new FindMinMax<Number>();
	}
}
