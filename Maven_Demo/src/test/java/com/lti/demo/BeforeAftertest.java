package com.lti.demo;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAftertest {

Calculator c=new Calculator();
	
	@BeforeAll
	public static void startup() {
		System.out.println("db conn start");
	}
	@BeforeEach
	public void testStartUp() {
		System.out.println("start");
	}
	@Test
	public void testAdd() {
		int r=c.add(100,200);
		Assertions.assertEquals(300,r);
	}
	@Test
	public void testAdd1() {
		int r=c.add(100,200);
		Assertions.assertEquals(300,r);
	}
	@AfterEach
	public void testShutDown() {
		System.out.println("shutdown");
	}
	@AfterAll
	public static void shutdown() {
		System.out.println("db conn stop");
	}


}
