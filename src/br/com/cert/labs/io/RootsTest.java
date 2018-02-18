package br.com.cert.labs.io;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RootsTest {

	public static void main(String[] args) {
		File[] listRoots = File.listRoots();
		for (File f : listRoots) {
			System.out.println(f);
		}
		
		Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
		for (Path p : rootDirectories) {
			System.out.println(p);
		}
	}

}
