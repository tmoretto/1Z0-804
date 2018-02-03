package br.com.cert.labs.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("/Users/tiagomoretto/java-labs");
		FileVisitor<Path> visitor = new Visitor();
		Files.walkFileTree(dir, visitor);

	}
	
	private static final class Visitor extends SimpleFileVisitor<Path> {
		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException {
			if (bfa.size() > 1) {
				System.out.println(file);
			}
			
			return FileVisitResult.CONTINUE;
		}
	}

}
