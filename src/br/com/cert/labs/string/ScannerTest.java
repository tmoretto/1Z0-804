package br.com.cert.labs.string;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerTest {

	public static void main(String[] args) {
		
		String input = "1 done 2 done all done";
		Scanner s = new Scanner(input);
		//s.findInLine("(\\d+) done (\\d+) done (\\w+) done");
		s.findInLine("(\\d+ done \\d+ done \\w+ done)");
		MatchResult result = s.match();
		for (int i = 1; i <= result.groupCount(); i++) {
			System.out.println(result.group(i) + " ");
		}
		s.close();
		
	}

}
