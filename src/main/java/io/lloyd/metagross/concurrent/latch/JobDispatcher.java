package io.lloyd.metagross.concurrent.latch;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Latch主分发
 * 
 * @author LilyBlooper blooper@163.com
 * @since 0.1
 */
public class JobDispatcher {
	private int tableSize = 100;
	/* 主线程控制子线程启动时机，子线程通知主线程工作完毕 */
	private CountDownLatch startLatch;
	private CountDownLatch doneLatch;

	private ExecutorService pool;
	private List<Future<List<String>>> futures;

	private void handleJob(String bizParam) {
		// 判断是否已经存过
		for (int index = 0; index < tableSize; index++) {
			// 子线程会等待主线程startLatch
			futures.add(pool.submit(new JobWorker(bizParam, index + "", startLatch, doneLatch)));
		}
		startLatch.countDown(); // 子线程开始执行
		try {
			doneLatch.await();
			pool.shutdown();
			for (Future<List<String>> f : futures) {
				List<String> list = f.get();
				// do something
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

	}

}
