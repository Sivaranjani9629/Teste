package com.cubesitetest.CubeWebServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Salesforce_Cube {
	
WebDriver driver;
	
	By Services = By.xpath("//label[@for='toggle0']");
	By Salesforce = By.xpath("//p[@class='text-md font-semibold tracking-wide'][normalize-space()='Salesforce']");
	By SFHeadContent = By.xpath("(//h1[contains(text(),'All your sales and service')])[1]");
	By FreeAssesment = By.xpath("(//a[normalize-space()='Start Free Assessment'])[1]");
	
	
	public Salesforce_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigateToSalesforce() throws InterruptedException
	{
		driver.findElement(Services).click();
		driver.findElement(Salesforce).click();
		String expectedUrl = "https://cubesimple.com/services/salesforce/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
		String SFContent = driver.findElement(SFHeadContent).getText();
		
		assert SFContent.startsWith("All your sales and service");
	}
	
	public void clickOnStartAssessment()
	{
		driver.findElement(FreeAssesment).click();
		String expectedUrl1 = "https://cubesimple.com/contact-us/";
		String actualUrl1 = driver.getCurrentUrl();
		assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		driver.navigate().back();
	}

}
