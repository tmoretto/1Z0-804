package br.com.cert.labs.basics;

public class TestEnum {

	public enum Cats {collie, harrier};
	
	public static void main(String[] args) {
		Cats myCat = Cats.collie;
		
		switch (myCat) {
		case collie:
			System.out.println("collie");
		case harrier:
			System.out.println("harrier");
		}

	}

}
