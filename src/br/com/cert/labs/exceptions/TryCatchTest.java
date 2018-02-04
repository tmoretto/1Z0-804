package br.com.cert.labs.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryCatchTest {

	public static void main(String[] args) {
		
		try (InputStream is = new FileInputStream("xpto"); OutputStream os = new FileOutputStream("xpto")) {
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
				System.out.println("Read ans written bytes " + bytesRead);
			}
			
		} catch (IOException | NullPointerException e) {
			//multi-catch feature added to Java 7 states that the 
			//exception parameter in the catch clause is implicitly final.
			//e = new FileNotFoundException(); //compile error
			e.printStackTrace();
		} 
		

	}

}
