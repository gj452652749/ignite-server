package com.jc.microservice.dao;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class AppDao {
	@Autowired
	Ignite ignite;
	public void put(int key, String value){
		IgniteCache<Integer, String> cache = ignite.getOrCreateCache("demo");
		cache.put(key, value);
	}

}
