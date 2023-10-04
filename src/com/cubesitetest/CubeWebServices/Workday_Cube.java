package com.cubesitetest.CubeWebServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Workday_Cube {
	
WebDriver driver;
	
	By Services = By.xpath("//label[@for='toggle0']");
	By Workday = By.xpath("//p[contains(text(),'Workday')]");
	By WorkdayHeadContent = By.xpath("(//h1[contains(text(),'Your one-stop solution to any concerns related to ')])[1]");
	By AdvisoryServices = By.xpath("//h5[normalize-space()='Advisory Services']");
	By ASHeadContent = By.xpath("(//h1[normalize-space()='Optimize and customize your Workday instance'])[1]");
	
	
	public Workday_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToWorkday() throws InterruptedException
	{
		driver.findElement(Services).click();
		Thread.sleep(2000);
		driver.findElement(Workday).click();
		Thread.sleep(800);
		String expectedUrl = "https://cubesimple.com/services/workday/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
		String WDContent = driver.findElement(WorkdayHeadContent).getText();
		assert WDContent.startsWith("Your one-stop solution to any");
	}
	
	public void clickOnAdvisory() throws InterruptedException
	{
		driver.findElement(AdvisoryServices).click();
		Thread.sleep(200);
		String expectedUrl1 = "https://cubesimple.com/services/workday/advisory/";
		String actualUrl1 = driver.getCurrentUrl();
		assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		String ASContent = driver.findElement(ASHeadContent).getText();
		assert ASContent.startsWith("Optimize and customize");
	}

}
