package io.lloyd.metagross;

import redis.clients.jedis.Jedis;

public class Mock {
	private Long number;

	public static void main(String[] args) {
		Long a = new Long(0);
		Long b = 0l;
		long c = 0l;
		Long d = 388l;
		System.out.println(a != 0);
		System.out.println(a != 0l);
		System.out.println(a != 0l);
		System.out.println(b != 0);
		System.out.println(b != 0l);
		System.out.println(c != 0);
		System.out.println(c != 0l);
		System.out.println(d != 0);

		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.auth("000000");
		System.out.println(jedis.get("csadfjsalkdfsa"));
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
}