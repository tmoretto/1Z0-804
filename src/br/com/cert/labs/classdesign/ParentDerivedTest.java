package br.com.cert.labs.classdesign;


class DerivedOne extends ParentDerivedTest {
}

class DerivedTwo extends ParentDerivedTest {
}

public class ParentDerivedTest {

	public static void main(String[] args) {
		ParentDerivedTest p = new ParentDerivedTest();
		DerivedOne d1 = new DerivedOne();
		DerivedTwo d2 = new DerivedTwo();
		
		//d1 = (DerivedOne)d2; //compile error

	}

}
