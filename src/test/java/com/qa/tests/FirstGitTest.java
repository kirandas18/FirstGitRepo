package com.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.main.BasicOperations;

public class FirstGitTest extends BasicOperations{
	
	//BasicOperations basicOperations;
	
	@Test
	public void addTest()
	{
		
		int c =add(10, 20);
		System.out.println(c);
		
	}
	
	
	

}
