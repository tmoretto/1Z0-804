package br.com.cert.labs.localization;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(new Date()));
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
		
		sdf = new SimpleDateFormat("zzzz");
		System.out.println(sdf.format(new Date()));

		sdf = new SimpleDateFormat("zzzz", Locale.CANADA);
		System.out.println(sdf.format(new Date()));
	}

}
