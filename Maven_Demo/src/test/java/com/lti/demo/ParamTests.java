package com.lti.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import com.lti.entity.Calculator;



class ParamTests {
	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,55,100})
	void testArrays(int arg) {
		System.out.println(arg);
		Assertions.assertTrue(arg%2==0);
	}

	@Disabled
	@ParameterizedTest(name="#(index) = {0}")
	@DisplayName("Should Pass all non-null arguments to method")
	@ValueSource(strings= {"Hello","Hell no"})
	void testParams(String msg) {
		String searchKey="Hello";
		Assertions.assertTrue(msg.contains(searchKey));
	}
	
	@Disabled
	@RepeatedTest(2)
	public void shouldRepeat()
	{
		int x=10,y=20;
		assertEquals(200,x*y);
	}
	@Disabled
	@Test
	public void testLambda()
	{
		Integer[] intAry = {2,3,7,5,10};
		
		List<Integer> numbers=Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)),
				() -> assertEquals(3,numbers.get(1)),
				() -> assertEquals(7,numbers.get(2)),
				() -> assertEquals(5,numbers.get(3)),
				() -> assertEquals(10,numbers.get(4))
				
				);
	}
	
	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class,()-> {
				Integer.parseInt("One");
				
		});
	}
	
	@Test
	  void testException1() {

		  Calculator c= new Calculator();
		  
		  final Exception e = assertThrows(ArithmeticException.class, () -> {
			  c.searchEmpId(0);
	    
	    });
	    Assertions.assertEquals("u enetered zero",e.getMessage());
	  }
	  

}
