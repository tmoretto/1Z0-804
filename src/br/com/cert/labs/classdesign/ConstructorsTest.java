package br.com.cert.labs.classdesign;

class CA {
	/*
	public CA() {

	}*/

	public CA(String s) {
		//this();
	}
}

class CB extends CA {

	public CB(String s, Integer i) {
		super(s);
	}
	
}

class CC extends CB {
	private CC() {
		super("",0);
	}
	
	public CC(String s) {
		super("",0);
	}
	
	public CC(int i) {
		super("",0);
	}	
}

public class ConstructorsTest {

}
