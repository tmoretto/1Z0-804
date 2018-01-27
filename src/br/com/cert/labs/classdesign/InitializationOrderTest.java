package br.com.cert.labs.classdesign;

public class InitializationOrderTest {

	static {
		add(2);
	}

	public InitializationOrderTest() {
		add(5);
		System.out.println("Constructor!");
	}

	static {
		add(4);
	}

	{
		add(6);
	}

	static {
		new InitializationOrderTest();
	}

	{
		add(8);
	}

	public static void main(String[] args) {
		System.out.println("Main method!");
		add(10);
	}

	{
		add(11);
	}
	static {	
		add(12);
	}

	static void add(int num) {
		System.out.println(num + " ");
	}

	
	/*
	
The principle for order of initialization is:

1. Superclass first (not discussed here in this case)
2. Static variable declarations and static initialization blocks in the order of appearance
3. Instance variable declarations and static initialization blocks in the order of appearance
4. The constructor	
	
	Static initializer are the first, so you get:	
		2 
		4

	But in the next static initializer you call a new instance of 
	Test1.class, so instance initializers are triggered, constructor 
	is triggered after them and you get:
		6 
		8 
		11 
		5 
		Constructor!
	
	After that the rest of static initializers are called. so:
		12
	
	And the last is main method:
		Main method!
		10 	
	
	 */
	 
	
}
