package com.park.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {

	
	public static void main(String[] args) {
		
		
		Logger log = LoggerFactory.getLogger(test.class);
		
		log.info("test");
		log.error("test");
		log.debug("test");
		log.warn("test");
		
	}
}
