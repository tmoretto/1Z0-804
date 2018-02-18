package br.com.cert.labs.nio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	public void givenPath_whenRemovesRedundancies_thenCorrect2() {
	    Path p = Paths.get("/../baeldung/articles");
	    Path p2 = Paths.get("/home/baeldung/../articles");
	    
	    Path cleanPath = p.normalize();
	    Path cleanPath2 = p2.normalize();
	  
	    assertEquals("/baeldung/articles", cleanPath.toString());
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
	
	@Test
	public void givenTwoPaths_whenJoinsAndResolves_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles");
	    Path p2 = p1.resolve("java");
	    assertEquals("/baeldung/articles/java", p2.toString());
	}

	@Test
	public void givenTwoSamePaths_whenJoinsAndResolves_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles");
	    Path p2 = p1.resolve("articles/java");
	    assertEquals("/baeldung/articles/articles/java", p2.toString());
	}
	
	@Test
	public void givenTwoSamePaths2_whenJoinsAndResolves_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles");
	    Path p2 = p1.resolve("/articles/java");
	    assertEquals("/articles/java", p2.toString());
	}
	
	@Test
	public void givenTwoPathsAnFile_whenJoinsAndResolves_thenCorrect() {
	    Path p1 = Paths.get("/Whizlabs/java/NIO/myfiles");
	    Path p2 = Paths.get("myfiles/myfile.txt");
	    Path p = p2.resolve(p1);
	    
	    assertEquals("/Whizlabs/java/NIO/myfiles", p.toString());
	}

	@Test
	public void givenSiblingPaths_whenCreatesPathToOther_thenCorrect() {
	    Path pathArticles = Paths.get("articles");
	    Path pathAuthors = Paths.get("authors");
	 
	    Path pathArticles_relative_pathAuthors = pathArticles.relativize(pathAuthors);
	    assertEquals("../authors", pathArticles_relative_pathAuthors.toString());
	    
	    Path pathAuthors_relative_pathArticles = pathAuthors.relativize(pathArticles);
	    assertEquals("../articles", pathAuthors_relative_pathArticles.toString());
	}

	@Test
	public void givenNonSiblingPaths_whenCreatesPathToOther_thenCorrect() {
	    Path p1 = Paths.get("/baeldung");
	    Path p2 = Paths.get("/baeldung/authors/articles");
	 
	    Path p1_rel_p2 = p1.relativize(p2);
	    assertEquals("authors/articles", p1_rel_p2.toString());
	    
	    Path p2_rel_p1 = p2.relativize(p1);
	    assertEquals("../..", p2_rel_p1.toString());
	}
	
	@Test
	public void givenNonSiblingPaths_whenCreatesPathToOther2_thenCorrect() {
	    Path p1 = Paths.get("/baeldung");
	    Path p2 = Paths.get("/xpto/xyz");
	 
	    Path p1_rel_p2 = p1.relativize(p2);
	    assertEquals("../xpto/xyz", p1_rel_p2.toString());
	    
	    Path p2_rel_p1 = p2.relativize(p1);
	    assertEquals("../../baeldung", p2_rel_p1.toString());
	}
	

	@Test
	public void givenNonSiblingPaths_whenCreatesPathToOther3_thenCorrect() {
	    Path path01 = Paths.get("Topic.txt");
	    Path path02 = Paths.get("Demo.txt");
	    Path path03 = Paths.get("/Java/JavaFX/Topic.txt");
	    Path path04 = Paths.get("/Java/2011");
	
	    Path path01_to_path02 = path01.relativize(path02);
	    assertEquals("../Demo.txt", path01_to_path02.toString());
	
	    Path path02_to_path01 = path02.relativize(path01);
	    assertEquals("../Topic.txt", path02_to_path01.toString());
	
	    Path path03_to_path04 = path03.relativize(path04);
	    assertEquals("../../2011", path03_to_path04.toString());
	
	    Path path04_to_path03 = path04.relativize(path03);
	    assertEquals("../JavaFX/Topic.txt", path04_to_path03.toString());
	}
	
	@Test
	public void givenTwoPaths_whenTestsEquality_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles/myfile.txt");
	    Path p2 = Paths.get("/baeldung/articles/myfile.txt");
	    Path p3 = Paths.get("/baeldung/authors");
	 
	    assertTrue(p1.equals(p2));
	    assertFalse(p1.equals(p3));
	}

	@Test
	public void givenPath_whenInspectsStart_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles");
	    assertTrue(p1.startsWith("/baeldung"));
	}
	
	@Test
	public void givenPath_whenInspectsEnd_thenCorrect() {
	    Path p1 = Paths.get("/baeldung/articles");
	    assertTrue(p1.endsWith("articles"));
	}
	
	@Test
	public void givenPath_whenInspectsEnd_thenCorrect1() {
	    Path p1 = Paths.get("/baeldung/articles/java");
	    System.out.println("Count - " + p1.getNameCount());
	    System.out.println("0 - " + p1.getName(0).toString());
	    System.out.println("1 - " + p1.getName(1).toString());
	    System.out.println("2 - " + p1.getName(2).toString());
	    
	    
	    Path p2 = Paths.get("/other");
	    Path p = Paths.get(p2.getRoot().toString(), p1.subpath(0, 3).toString());
	    assertEquals("/baeldung/articles/java", p.toString());
	   
	}
	
}
