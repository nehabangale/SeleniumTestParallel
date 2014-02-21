package com.univ.runner;

import java.util.ArrayList;

import org.testng.annotations.Factory;



public class TestFactory {
	
	@Factory
	public Object[] testFactory()
	{
		ArrayList<BaseTest> testObjects = new ArrayList<BaseTest> ();
		
		testObjects.add(new Feature1());
		testObjects.add(new Feature2());
		
		return testObjects.toArray();
	}

}
