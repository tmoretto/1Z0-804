package br.com.cert.labs.basics;

class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class AssignTest {

	public static void main(String[] args) {
		String s = "going";
		print(s, s = "gone");
		
		Integer i = 10;
		print(i, i = 15, i = 20);
		System.out.println(i);
		
	    Dog aDog = new Dog("Max");
	    // we pass the object to foo
	    foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println("equal Max? " + aDog.getName().equals("Max"));  // true, java passes by value
	    System.out.println("equal Fifi? " + aDog.getName().equals("Fifi")); // false
	    
	    foo2(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println("equal Max? " + aDog.getName().equals("Max"));  // true, java passes by value
	    System.out.println("equal Fifi? " + aDog.getName().equals("Fifi")); // false
	    
	}
	
	static void print(String a, String b) {
		System.out.println(a + ", " + b);
	}
	
	static void print(Integer a, Integer b, Integer c) {
		System.out.println(a + ", " + b + ", " + c);
	}
	
	public static void foo(Dog d) {
	    d.getName().equals("Max"); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	    System.out.println("foo---------------");
	}
	
	public static void foo2(Dog d) {
	    d.getName().equals("Max"); // true
	    // this changes the name of d to be "Fifi"
	    d.setName("Fifi");
	    System.out.println("foo2--------------");
	}
		
}
