package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.LargestNum;

public class ArrayExampleTest{
	
	@Test
	public void getLargestNum()
	{
		int arr[] = {0,23,5,96,35};
		int expected = 96;
		
		LargestNum ex = new LargestNum();
		//int actual = ex.findLargestNum();
		
		//assertEquals(expected,actual); 
	}

}
