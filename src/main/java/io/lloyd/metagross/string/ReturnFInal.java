package io.lloyd.metagross.string;

import java.util.concurrent.locks.ReentrantLock;

import javax.sound.midi.Soundbank;

public class ReturnFInal {
	private final static ReentrantLock pushedLock = new ReentrantLock();
	public static void main(String[] args) {
		
		// 是否推送过检查
		String uniqueKey = "1";
		try{
			pushedLock.lock();
			if ("1".equals(uniqueKey)) {
				return;
			}
			
		}finally {
			pushedLock.unlock();
			System.out.println("finally");
		}
	}
}
