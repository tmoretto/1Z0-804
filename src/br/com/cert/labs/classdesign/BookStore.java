package br.com.cert.labs.classdesign;

public class BookStore {

	private static final int taxId = 30000;
	private String name;

	public String searchBook(final String criteria) {
		int count = 50;
		class Enumerator {
			String iterate(int k) {
				count = 5;
				name = "Jack";
				String r = " " + taxId + name + criteria + k + count;

				return r;
			}
		}
		return new Enumerator().iterate(count);
	}

	public static void main(String[] args) {
		new BookStore().searchBook("aaa");
	}

}
