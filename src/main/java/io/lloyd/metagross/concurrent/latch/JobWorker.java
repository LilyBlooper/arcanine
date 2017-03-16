package io.lloyd.metagross.concurrent.latch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

/**
 * JobWorker<BR/>
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class JobWorker implements Callable<List<String>> {
	private static Logger logger = Logger.getLogger(JobWorker.class);

	private String bizParam; // 某个业务参数
	private String workerName; // 线程名称 ： 00|12|33|99

	private CountDownLatch startLatch; // 同步开始计数器
	private CountDownLatch doneLatch; // worker结束同步计数器

	/**
	 * 构造器
	 * 
	 * @param bizParam
	 *            某个业务参数
	 * @param workerName
	 *            工人名称
	 * @param startLatch
	 * @param doneLatch
	 */
	public JobWorker(String bizParam, String workerName, CountDownLatch startLatch,
			CountDownLatch doneLatch) {
		this.bizParam = bizParam;
		this.workerName = workerName;
		this.startLatch = startLatch;
		this.doneLatch = doneLatch;
	}

	@Override
	public List<String> call() throws Exception {
		long startTime = System.currentTimeMillis();
		startLatch.await(); // 等待主线程命令开始
		List<String> retList = doSomeBiz(bizParam);
		doneLatch.countDown(); // 告知主线程自己做完了
		long endTime = System.currentTimeMillis();
		logger.info("JobWorker[" + workerName + "]处理耗费时间：" + (endTime - startTime));
		return retList;
	}

	private List<String> doSomeBiz(String bizParam) {
		List<String> mockList = new ArrayList<String>();
		mockList.add("foo");
		return mockList;
	}

}
