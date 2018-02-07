package br.com.cert.labs.generics;

interface II<A> {
	
	void setA(A a);
	A getA();
}

class GA implements II {

	@Override
	public void setA(Object a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getA() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class WildTest<A extends II> {

	public static void main(String[] args) {

		WildTest<GA> wt = new WildTest<>();
	}

}
