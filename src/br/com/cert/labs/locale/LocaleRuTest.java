package br.com.cert.labs.locale;

import java.util.Locale;

public class LocaleRuTest {

	public static void main(String[] args) {
		Locale loc1 = new Locale("ru");
		Locale loc2 = new Locale.Builder().setLanguage("Ru").setRegion("ru").build();
		Locale loc3 = Locale.getDefault();
		
		System.out.println(loc1.getDisplayLanguage(new Locale("PT")));
		System.out.println(loc2.getDisplayLanguage(new Locale("PT")));
		System.out.println(loc3.getDisplayLanguage(new Locale("PT")));

	}

}
