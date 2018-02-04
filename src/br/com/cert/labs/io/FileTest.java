package br.com.cert.labs.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("/Users/tiagomoretto/java-labs/a/b/c/d/e");
		//file.mkdir();
		file.mkdirs();
		
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		file = new File("/Users/tiagomoretto/java-labs");
		
		System.out.println("-----------");
		String[] sdirs = file.list();
		for (int i = 0; i < sdirs.length; i++) {
			System.out.println(sdirs[i]);
		}
		System.out.println("-----------");
		File[] fdirs = file.listFiles();
		for (int i = 0; i < fdirs.length; i++) {
			System.out.println(fdirs[i]);
		}
	}

}
