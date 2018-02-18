package br.com.cert.labs.localization;

import java.util.Locale;

public class LanguageTest {

	public static void main(String[] args) {
		
		System.out.println(Locale.US.getDisplayLanguage());
		System.out.println(Locale.US.getDisplayCountry());
		
		System.out.println(Locale.ENGLISH.getDisplayLanguage());
		System.out.println(Locale.ENGLISH.getDisplayCountry());

		System.out.println(Locale.CHINA.getDisplayLanguage());
		System.out.println(Locale.CHINA.getDisplayCountry());

		System.out.println(Locale.CHINESE.getDisplayLanguage());
		System.out.println(Locale.CHINESE.getDisplayCountry());
	}

}
