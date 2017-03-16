package io.lloyd.metagross.concurrent;

import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

public class Main {
	
	@Test
	public void testConstructLock() throws Exception {
		ReentrantLock lock = new ReentrantLock();
		int max = 15;
		for (int i = 0; i < max; i++) {
			new ThreadWithLockIn(i, lock).start();
		}
	}

	@Test
	public void testStaticField() throws Exception {
		int max = 15;
		for (int i = 0; i < max; i++) {
			new ThreadWithLock(i).start();
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		int max = 15;
		for (int i = 0; i < max; i++) {
			new ThreadWithLock(i).start();
		}
	}
	
}
