package com.cubesitetest.CubeWebFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class War_Cube {
	
	WebDriver driver;
	
	By Frameworks = By.xpath("//label[@for='toggle2']");
	By WarFramework = By.xpath("//p[contains(text(),'WAR Framework')]");
	
	public War_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateTowarframework() throws InterruptedException
	{
		driver.findElement(Frameworks).click();
		Thread.sleep(2000);
		driver.findElement(WarFramework).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/our-frameworks/war-framework/";
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