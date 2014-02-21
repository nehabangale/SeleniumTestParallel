package com.univ.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Feature1 extends BaseTest{

	@Test
	public void test1 ()
	{
		getDriver().get("http://www.google.com");
		WebElement textBox = getDriver().findElement(By.cssSelector("input#gbqfq"));
        textBox.click();
        textBox.sendKeys("Test 1!");
        
	}
	
	@Test
    public void test3(){
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Re-enter Email']"));
        textBox.click();
        textBox.sendKeys("Test 3!");
        
    }
	
}
