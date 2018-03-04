package br.com.cert.labs.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {

		String str = "oo la la, shut the door, shut the door. oo";
		String rex = "\\Soo\\S|\\boo\\b";
		//String rex = "\\Soo\\S";
		String replace = "OO";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		String val = m.replaceAll(replace);
		System.out.println(val);
		
	}

}
