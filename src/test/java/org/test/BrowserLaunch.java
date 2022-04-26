package org.test;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.baseclass.BaseClass;
import org.test.loginpage.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) throws IOException {
	
		chromeLaunch();
		urlLaunch("http://www.leafground.com/");
		maximize();
		implicityWait(10);

		
		WebElement btnclick = driver.findElement(By.xpath("//a[contains(@class,'wp-')]"));
		btnclick.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
