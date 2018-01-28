package br.com.cert.labs.classdesign;

class Parent {
	
	static void get1() {
		System.out.println("Parent get 1");
	}
	
	void get2() {
		System.out.println("Parent get 2");
	}
	
	public void get() {
		get1();
		get2();
	}
	
    public static void display() {
        System.out.println("Inside static method of super class");
    }
	
}

public class StaticInheritanceTest extends Parent {

	static void get1() {
		System.out.println("Child get 1");
	}
	
	void get2() {
		System.out.println("Child get 2");
	}
	
    public static void display() {
        System.out.println("Inside static method of child class");
    }
	
	public static void main(String[] args) {
		(new StaticInheritanceTest()).get();
		
		StaticInheritanceTest c = new StaticInheritanceTest();
		c.display();
		
		Parent p = new StaticInheritanceTest();
		p.display();
		
	}

}
