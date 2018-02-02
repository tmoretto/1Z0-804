package br.com.cert.labs.nio;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

import org.junit.Test;

public class NIOFilesTest {

	@Test
	public void filesMoveTest() throws IOException {

		Path path1 = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfile.txt");
		Path path2 = Paths.get("../myfile.txt");

		Path path3 = Files.move(path1, path2);

		assertEquals("../myfile.txt", path3.toString());
	}

	@Test
	public void filesMoveWithReplaceTest() throws IOException {
		Path sourcePath = Paths.get("data/logging-copy.properties");
		Path destinationPath = Paths.get("data/subdir/logging-moved.properties");
		try {
			Path resultPath = Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			assertEquals("data/subdir/logging-moved.properties", resultPath.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void filesCopyWithReplaceTest() throws IOException {
		Path sourcePath = Paths.get("data/logging-copy.properties");
		Path destinationPath = Paths.get("data/subdir/logging-moved.properties");
		try {
			Path resultPath = Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			assertEquals("data/subdir/logging-moved.properties", resultPath.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void readAllAtributesTest() throws IOException {
		Path sourcePath = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfile.txt");
		Map attributes = Files.readAttributes(sourcePath, "*");
		System.out.println(attributes);
	}
	
	@Test
	public void readSpecificAtributeTest() throws IOException {
		Path sourcePath = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfile.txt");
		Map attributes = Files.readAttributes(sourcePath, "size");
		System.out.println(attributes);
	}
	
	@Test
	public void readBasicAtributesTest() throws IOException {
		Path sourcePath = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfile.txt");
		BasicFileAttributes attributes = Files.readAttributes(sourcePath, BasicFileAttributes.class);
		System.out.println(attributes.size());
		System.out.println(attributes.creationTime());
		System.out.println(attributes.isDirectory());
		System.out.println(attributes.lastModifiedTime());
	}

	@Test
	public void readSizeByFilesTest() throws IOException {
		Path sourcePath = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfile.txt");
		System.out.println(Files.size(sourcePath));
		
		
	}

}
