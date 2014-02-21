package com.univ.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Feature2 extends BaseTest{

	@Test
	public void test2 ()
	{
		getDriver().get("http://www.google.com");
		WebElement textBox = getDriver().findElement(By.cssSelector("input#gbqfq"));
        textBox.click();
        textBox.sendKeys("Test 2!");
        
	}
	
	@Test
    public void test4(){
        getDriver().get("http://www.facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Re-enter Email']"));
        textBox.click();
        textBox.sendKeys("Test 4!");
        
    }
	
	
}
