package com.phoenix.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.*;

public class CalculatorServiceTest {

	private CalculatorService calci;
	
	@Before
	public void setUp()
	{
	  calci=new CalculatorService(new Calculator());	
	  
	}
	
	@Test
	public void testAddition()
	{
		assertEquals(20,calci.addition(10, 10));
		
	}
	
	
	
	@After
	public void clean()
	{
		calci=null;
	}
}
