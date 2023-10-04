package com.cubesitetest.CubeWebResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseStudies_Cube {
	
WebDriver driver;
	
	By Resources = By.xpath("//label[contains(text(),'Resources')]");
	By casestudy = By.xpath("(//p[contains(text(),'Case Studies')])[1]");
	
	
	public CaseStudies_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateCaseStudy() throws InterruptedException
	{
		driver.findElement(Resources).click();
		Thread.sleep(2000);
		driver.findElement(casestudy).click();
		Thread.sleep(2000);
		String expectedUrl = "https://cubesimple.com/resources/case-studies/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1000);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}

}
