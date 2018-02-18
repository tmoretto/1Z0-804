package br.com.cert.labs.locale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) throws ParseException {
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.UK).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.US).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, new Locale("PT")).format(new Date()));
	}

}
