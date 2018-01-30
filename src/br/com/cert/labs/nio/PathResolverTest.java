package br.com.cert.labs.nio;

import java.nio.file.*;

public class PathResolverTest {


	public static void main(String[] args) {
		Path path1 = Paths.get("/Users/tiagomoretto/java-labs/NIO/myfiles");
		Path path2 = Paths.get("myfiles/myfile.txt");
		Path path3 = Paths.get("myfiles/myfile.txt54545454");
		
		Path path = path2.resolve(path1);
		System.out.println(path.toString());

		

	}

}
