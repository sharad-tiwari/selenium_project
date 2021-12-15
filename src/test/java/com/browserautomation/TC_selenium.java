package com.browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_selenium {
	
	
	@Test
	public void login_Test()
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.rsystems.com/");
	   
	   
	   //Assert.assertEquals(driver.getTitle(),"youtube.com");
	   
	   driver.close();
	 }

}
