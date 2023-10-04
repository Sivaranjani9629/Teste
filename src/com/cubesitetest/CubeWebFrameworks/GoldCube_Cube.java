package com.cubesitetest.CubeWebFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoldCube_Cube {
	
	WebDriver driver;
	
	By Framework = By.xpath("//label[@for='toggle2']");
	By Gold = By.xpath("//p[contains(text(),'GOLDCUBE Framework')]");
	
	
	public GoldCube_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToGoldframework() throws InterruptedException
	{
		driver.findElement(Framework).click();
		Thread.sleep(2000);
		driver.findElement(Gold).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/our-frameworks/goldcube-framework/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1000);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	 public static boolean validateurl(WebElement element, String expectedUrl) {
	        try {
	            String actualUrl = element.getText();
	            return actualUrl.equals(expectedUrl);
	        } catch (Exception e) {
	            return false;   
	        } 
	 }
}
