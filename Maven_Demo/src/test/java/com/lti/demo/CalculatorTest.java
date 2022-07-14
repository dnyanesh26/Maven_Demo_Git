package com.lti.demo;

import org.junit.jupiter.api.*;


import com.lti.entity.Calculator;

class CalculatorTest {
	Calculator c=new Calculator();
	@Test
	public void testAdd() {
		int r=c.add(100,200);
		Assertions.assertEquals(300,r);
	}
	
	
	
	

}
