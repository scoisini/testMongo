package testJedis.testJedis;

import redis.clients.jedis.Jedis;

public class testJedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "haha");
		String value = jedis.get("foo");
		System.out.print(value);
	}
}
