package br.com.cert.labs.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SiblingsTest {

	public static void main(String[] args) {
	    Path rootPath = Paths.get("/home/docs");
	    Path resolvedPath = rootPath.resolve("backup/users.txt");

	    System.out.println("resolvedPath: " + resolvedPath);
	    System.out.println();
	    
	    resolvedPath = rootPath.resolve("tmp/A.mp3");
	    System.out.println("rootPath: " + rootPath);
	    System.out.println("resolvedPath: " + resolvedPath);
	    System.out.println();

	    
	    Path rootPath2 = Paths.get("C:\\home\\docs\\xpto");
	    resolvedPath = rootPath2.resolve("tmp\\A.mp3");
	    System.out.println("resolvedPath: " + resolvedPath);
	    
	    resolvedPath = rootPath2.resolveSibling("tmp\\A.mp3");
	    System.out.println("resolvedSiblingPath: " + resolvedPath);
		   
	    Path rootPath3 = Paths.get("docs");
	    resolvedPath = rootPath3.resolveSibling("tmp\\A.mp3");
	    System.out.println("resolvedSiblingPath: " + resolvedPath);
	    
	}

}
