package io.lloyd.metagross.plain;

import org.junit.Test;

public class ThreadTest {
	@Test
	public void testName() throws Exception {
		/**
		 * 2. 获取服务器文件路径
		 */
		// 使用classloader
		Thread.currentThread().getContextClassLoader().getResource("xxx.properties").getPath();
	}
}
