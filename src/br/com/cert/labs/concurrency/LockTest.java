package br.com.cert.labs.concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {

	public static void main(String[] args) {
		reentrantLock();
		readWriteLock();
	}

	private static void reentrantLock() {
		ReentrantLock rLock = new ReentrantLock();
		boolean f1 = rLock.tryLock();
		System.out.println(f1);
		boolean f2 = rLock.tryLock();
		System.out.println(f2);
		
	}
	
	private static void readWriteLock() {
		ReadWriteLock rwLock = new ReentrantReadWriteLock();
		boolean f1 = rwLock.readLock().tryLock();
		System.out.println(f1);
		boolean f2 = rwLock.writeLock().tryLock();
		System.out.println(f2);
		
	}

}
