package br.com.cert.labs.generics;

public class GenericB<T extends Pet> {

	public static void main(String[] args) {
	}

}

interface Pet {
}

class Dog implements Pet {
}