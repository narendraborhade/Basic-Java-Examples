package com.example;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;
	
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testMain() throws Exception {
		
		String[] args = {"1","2"};
		
		calculator.main(args);
		
	}

	
}
