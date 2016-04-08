package org.lis.java;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.*;

public class RedisJava {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		System.out.println("Connection to server sucessfully");
		System.out.println("Server is running: " + jedis.ping());
		jedis.set("name", "liqi");
		System.out.println("name's value is: " + jedis.get("name"));

//		
//		jedis.lpush("mylist", "Redis");
//		jedis.lpush("mylist", "Mongodb");
//		jedis.lpush("mylist", "Mysql");
		
//		List<String> list = jedis.lrange("mylist", 0 , -1);
//		for(String s : list){
//			System.out.println("Stored string in redis:: "+ s);
//		}
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("Stored string in redis:: "+list.get(i));
//		}
		
		Set<String> keys =  jedis.keys("*");
		for(String s : keys){
			System.out.println("Stored string in redis:: "+ s);
		}
		
	}

}
