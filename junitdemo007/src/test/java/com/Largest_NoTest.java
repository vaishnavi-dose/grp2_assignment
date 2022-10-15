package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Largest_NoTest {

	@Test
	public void evaluatesExpression() 
	{
		
		Largest_No t1 = new Largest_No();
		int ans = t1.checkLargest(1,1000);
		assertEquals(1000,ans);
		
		int ans2 = t1.checkLargest(1000,2000);
		assertEquals(2000,ans2);
		
		int ans3 = t1.checkLargest(5000,4000);
		assertEquals(5000,ans3);
		
	}
	
	
}