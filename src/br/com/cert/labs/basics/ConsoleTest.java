package br.com.cert.labs.basics;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		System.out.println("got " + pw);
		String name = c.readLine("%s", "name: ");
		System.out.println(" got" + name);
	}

}
