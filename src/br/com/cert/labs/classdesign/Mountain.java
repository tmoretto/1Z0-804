package br.com.cert.labs.classdesign;

class Atomic {
	Atomic() {System.out.print("atom created "); }
}

class Rocker extends Atomic {
	Rocker(String type) { System.out.print(type); }
}

public class Mountain extends Rocker {
	
	Mountain() {
		super("granite created ");
		new Rocker("granite ");
	}

	public static void main(String[] args) {
		new Mountain();
	}

}
