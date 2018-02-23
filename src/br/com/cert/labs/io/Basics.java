package br.com.cert.labs.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Basics {

	static File file;
	
	public static void main(String[] args) throws IOException {
		file = new File("C:\\Users\\ctg2251\\Desktop\\Conecta\\Fase 2\\MTE\\massa_MTE.txt");
		
		readFileReader();
		readWithBuffered();
		
	}

	private static void readFileReader() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(file);
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}
	
	private static void readWithBuffered() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(
				new FileReader(file));
		String thisLine;
		while ((thisLine = br.readLine()) != null) { // while loop begins here
			System.out.println(thisLine);
		}
		br.close();
	}

}
