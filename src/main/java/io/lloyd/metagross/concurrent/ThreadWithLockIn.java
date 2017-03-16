package io.lloyd.metagross.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 传入锁
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class ThreadWithLockIn extends Thread {
	private ReentrantLock lock = new ReentrantLock();
	private int tname;

	public ReentrantLock getLock() {
		return lock;
	}

	public void setLock(ReentrantLock lock) {
		this.lock = lock;
	}

	public int getTname() {
		return tname;
	}

	public void setTname(int tname) {
		this.tname = tname;
	}

	public ThreadWithLockIn(int tname, ReentrantLock lock) {
		this.tname = tname;
		this.lock = lock;
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
