package br.com.cert.labs.basics;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		cal.roll(Calendar.MONTH, 11);
		
		System.out.println(cal.getTime());
		
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		System.out.println(cal.getTime());

		
	}

}
