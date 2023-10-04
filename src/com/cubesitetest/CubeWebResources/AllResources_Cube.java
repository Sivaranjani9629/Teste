package com.cubesitetest.CubeWebResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllResources_Cube {
	
WebDriver driver;
	
	By Resources = By.xpath("//label[contains(text(),'Resources')]");
	By allresources = By.xpath("//p[contains(text(),'All Resources')]");
	
	
	public AllResources_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToAllResources() throws InterruptedException
	{
		driver.findElement(Resources).click();
		Thread.sleep(800);
		driver.findElement(allresources).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/resources/all-resources/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1000);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	 
}

}
