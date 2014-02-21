package com.univ.runner;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;

	
	@BeforeMethod
    public void setUp() throws MalformedURLException {
        threadDriver = new ThreadLocal<RemoteWebDriver>();
        DesiredCapabilities dc =  new DesiredCapabilities("chrome", "28.0", Platform.WINDOWS);
        threadDriver.set(new RemoteWebDriver(new URL("http://54.215.65.82:4444/wd/hub"), dc));
    }
 
    public WebDriver getDriver() {
        return threadDriver.get();
    }

    @AfterMethod
    public void removeThread() {
    	getDriver().quit();
    	threadDriver.remove();
    }
    
    
}
