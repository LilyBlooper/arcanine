package io.lloyd.metagross.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 持有静态锁
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class ThreadWithLock extends Thread {
	private final static ReentrantLock lock = new ReentrantLock();
	private int tname;

	public int getTname() {
		return tname;
	}

	public void setTname(int tname) {
		this.tname = tname;
	}

	public ThreadWithLock(int tname) {
		this.tname = tname;
	}

	@Override
	public void run() {
		checkArticle();
	}

	private boolean checkArticle() {
		try {
			lock.lock();
			System.out.println("ThreadName::" + tname + "::LockAddress" + lock);
			Thread.sleep(1000 * 10);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return true;
	}

}
