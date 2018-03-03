package br.com.cert.labs.classdesign;

public class TestOuter1 {

	public void myOuterMethod() {
		this.new TestInner();
		new TestInner();
		
		//this.new TestStaticInner();
		new TestOuter1.TestStaticInner();
		new TestStaticInner();
	}
	
	public class TestInner {}
	
	public static class TestStaticInner {}
	
	
	public static void main(String[] args) {
		TestOuter1 to = new TestOuter1();
		to.new TestInner();
		//TestInner testInner = new TestInner();
		
		new TestOuter1.TestStaticInner();
		new TestStaticInner();
		
	}

}
