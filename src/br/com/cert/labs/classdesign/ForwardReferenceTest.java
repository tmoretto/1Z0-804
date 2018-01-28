package br.com.cert.labs.classdesign;

public class ForwardReferenceTest {

	public ForwardReferenceTest() {
		super();
	}

	public ForwardReferenceTest echoReference() {
		return this;
	}

	public void testLegalForwardReference() {
		// Illustration: Legal
		this.x = 5;
	}

	private int x = 0;

	// Illustration: Illegal
	//private ForwardReferenceTest b = a.echoReference(); //error
	private ForwardReferenceTest a = new ForwardReferenceTest();

}
