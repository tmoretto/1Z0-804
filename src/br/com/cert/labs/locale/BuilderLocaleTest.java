package br.com.cert.labs.locale;

import java.util.Locale;

public class BuilderLocaleTest {

	public static void main(String[] args) {
		Locale loc = new Locale.Builder().setRegion("CA").build();
		
		System.out.println(loc.getDisplayLanguage(new Locale("En")));
		System.out.println(loc.getDisplayCountry(new Locale("En")));

	}

}
