package br.com.cert.labs.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StartEndIndexTest {

	public static void main(String[] args) {
		// 01234
		String s = "ABCDE";

		// beginIndex the beginning index, inclusive.
		// endIndex the ending index, exclusive.
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(1, 1));

	}

	@Test
	public void testSubstring() {
		assertEquals("ABC", "ABCDE".substring(0, 3));
		assertEquals("WERT", "QWERT".substring(1, 5));
		assertEquals("IUY", "POIUY".substring(2, 5));
		assertEquals("V", "ZXCVB".substring(3, 4));
		assertEquals("BVC", "MNBVC".substring(2, 5));
	}

}
