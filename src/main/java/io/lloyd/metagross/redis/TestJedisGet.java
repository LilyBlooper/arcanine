package io.lloyd.metagross.redis;

import io.lloyd.metagross.util.RedisUtils;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @author LilyBlooper blooper@163.com
 */
public class TestJedisGet {
	public static void main(String[] args) {
		single();
	}

	private static void single() {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.auth("000000");
		List<Long> badgeList = new ArrayList<Long>();
		long startTime = System.currentTimeMillis();
		int size = 1200000;
		// 默认单链接 hincr 120w次
		for (int i = size; i < size + size; i++) {
			String deviceId = "iiaaxa12fhxua8xolaoxkdmvc0z8aksmvkxlaxdj1os89cnjvnalsd" + i;
			Long badge = jedis.hincrBy("BADGE", deviceId, 1);
			// badgeList.add(badge);
		}
		jedis.close();
		long elapsed = (System.currentTimeMillis() - startTime);
		System.out.println("[" + size + "]条消耗了[" + elapsed + "]毫秒");

		// for (Long long1 : badgeList) {
		// System.out.print(long1 + "::");
		// }
	}
	
	
	
	
}
