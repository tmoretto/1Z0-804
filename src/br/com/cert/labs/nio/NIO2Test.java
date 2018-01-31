package br.com.cert.labs.nio;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class NIO2Test {
	
	private static String HOME = System.getProperty("user.home");

	@Test
	public void givenPathString_whenCreatesPathObject_thenCorrect_Slash() {
	    Path p = Paths.get("/articles/baeldung");
	  
	    assertEquals("/articles/baeldung", p.toString());
	}

	@Test
	public void givenPathString_whenCreatesPathObject_thenCorrect_DoubleBar() {
	    Path p = Paths.get("\\articles\\baeldung");
	  
	    assertEquals("\\articles\\baeldung", p.toString());
	}
	
	@Test
	public void givenPathParts_whenCreatesPathObject_thenCorrect() {
	    Path p = Paths.get("/articles", "/baeldung", "xpto"); 
	    assertEquals("/articles/baeldung/xpto", p.toString());
	}
	
	@Test
	public void givenPath_whenRetrievesFileName_thenCorrect() {
	    Path p = Paths.get("/articles/baeldung/logs");
	    Path fileName = p.getFileName();
	    assertEquals("logs", fileName.toString());
	}
	
	@Test
	public void givenPath_whenRetrievesNameByIndex_thenCorrect() {
	    Path p = Paths.get("/articles/baeldung/logs");
	    Path name0 = p.getName(0);
	    Path name1 = p.getName(1);
	    Path name2 = p.getName(2);
	    assertEquals("articles", name0.toString());
	    assertEquals("baeldung", name1.toString());
	    assertEquals("logs", name2.toString());
	}	
	
	@Test
	public void givenPath_whenCanRetrieveSubsequenceByIndex_thenCorrect() {
	    Path p = Paths.get("/articles/baeldung/logs");
	 
	    Path subPath1 = p.subpath(0,1);
	    Path subPath2 = p.subpath(0,2);
	  
	    assertEquals("articles", subPath1.toString());
	    assertEquals("articles/baeldung", subPath2.toString());
	    assertEquals("articles/baeldung/logs", p.subpath(0, 3).toString());
	    assertEquals("baeldung", p.subpath(1, 2).toString());
	    assertEquals("baeldung/logs", p.subpath(1, 3).toString());
	    assertEquals("logs", p.subpath(2, 3).toString());
	}

	@Test
	public void givenPath_whenRetrievesParent_thenCorrect() {
	    Path p1 = Paths.get("/articles/baeldung/logs");
	    Path p2 = Paths.get("/articles/baeldung");
	    Path p3 = Paths.get("/articles");
	    Path p4 = Paths.get("/");
	 
	    Path parent1 = p1.getParent();
	    Path parent2 = p2.getParent();
	    Path parent3 = p3.getParent();
	    Path parent4 = p4.getParent();
	 
	    assertEquals("/articles/baeldung", parent1.toString());
	    assertEquals("/articles", parent2.toString());
	    assertEquals("/", parent3.toString());
	    assertEquals(null, parent4);
	}
	
	@Test
	public void givenPath_whenRetrievesRoot_thenCorrect() {
	    Path p1 = Paths.get("/articles/baeldung/logs");
	 
	    Path root1 = p1.getRoot();
	 
	    assertEquals("/", root1.toString());
	}
	
	@Test
	public void givenPath_whenRemovesRedundancies_thenCorrect1() {
	    Path p = Paths.get("/home/./baeldung/articles");
	    Path p2 = Paths.get("/home/baeldung/../articles");
	    
	    Path cleanPath = p.normalize();
	    Path cleanPath2 = p2.normalize();
	  
	    assertEquals("/home/baeldung/articles", cleanPath.toString());
	    assertEquals("/home/articles", cleanPath2.toString());
	}
	
	@Test
	public void givenPath_whenConvertsToBrowseablePath_thenCorrect() {
	    Path p = Paths.get("/home/baeldung/articles.html");
	    URI uri = p.toUri();
	    assertEquals("file:///home/baeldung/articles.html", uri.toString());
	}
	
	@Test
	public void givenPath_whenConvertsToAbsolutePath_thenCorrect() {
	    Path p = Paths.get("/home/baeldung/articles.html");
	    Path absPath = p.toAbsolutePath();
	    assertEquals("/home/baeldung/articles.html", absPath.toString());
	}
	
	@Test
	public void givenExistingPath_whenGetsRealPathToFile_thenCorrect() throws IOException {
	    Path p = Paths.get(HOME);
	    Path realPath = p.toRealPath();
	    assertEquals(HOME, realPath.toString());
	}
	
	@Test(expected = NoSuchFileException.class)
	public void givenInExistentPath_whenFailsToConvert_thenCorrect() throws IOException {
	    Path p = Paths.get("E:\\home\\baeldung\\articles.html");
	     
	    p.toRealPath();
	}


}
