package br.com.cert.labs.nio;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WatchDirTest {

	public static void main(String[] args) {
		Path dir = Paths.get("/Users/tiagomoretto/java-labs");
		
		WatchService watch;
		try {
			watch = dir.getFileSystem().newWatchService();
			dir.register(watch, ENTRY_DELETE, ENTRY_CREATE, ENTRY_MODIFY);
			
			WatchKey key = watch.poll(20000, TimeUnit.MILLISECONDS);
			List<WatchEvent<?>> events = key.pollEvents();
			
			for (WatchEvent event : events) {
				if (event.kind() == ENTRY_CREATE) {
					System.out.println("A file Created. " + event.toString());
				}
				if (event.kind() == ENTRY_MODIFY) {
					System.out.println("A file Modified. " + event.toString());
				}
				if (event.kind() == ENTRY_DELETE) {
					System.out.println("A file Delete. " + event.toString());
				}
			}
			
		} catch (ClosedWatchServiceException e) {
			System.out.println("Closed");
		} catch (NullPointerException e) {
			System.out.println("Null");
		} catch (IOException e) {
			System.out.println("IO");
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		
	}

}
