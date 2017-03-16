package io.lloyd.metagross.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子计数器，基于AtomicInteger实现
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class AtomicCounter {
	// 计数对象
	private AtomicInteger counter;

	public AtomicInteger getCounter() {
		return counter;
	}

	public void setCounter(AtomicInteger counter) {
		this.counter = counter;
	}

	public void addCount() {
		counter.getAndIncrement();
	}

	public void minusCount() {
		counter.getAndDecrement();
	}

	public boolean hasNext() {
		return (counter.get() > 0);
	}

	// 构造器
	public AtomicCounter() {
		counter = new AtomicInteger(0);
	}

	public AtomicCounter(int initValue) {
		counter = new AtomicInteger(initValue);
	}

}
