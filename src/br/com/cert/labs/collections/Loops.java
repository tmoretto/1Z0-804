package br.com.cert.labs.collections;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
	}

	void loop1() {
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> roots = fs.getRootDirectories();
		for (Path p : roots) {
			System.out.println(p);
		}
	}

	void loop2() {
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> roots = fs.getRootDirectories();
		Iterator<Path> it = roots.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	void loop3() {
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> roots = fs.getRootDirectories();
		Iterator<Path> it = roots.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	
}
