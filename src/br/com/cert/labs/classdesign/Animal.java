package br.com.cert.labs.classdesign;

public class Animal {

	protected static int refCount = 0;
	
	void runFast() {};
	
	static int getRefCount() {
		return refCount;
	}
	
}

class Lion extends Animal {
	
	/* NOT ALLOWED
	 
	public static int getRefCount() {
		return refCount;
	}
	
	public int getRefCount() {
		return refCount;
	}
	
	static void runFast() {}
	*/
	
}