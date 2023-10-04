package com.cubesitetest.CubeWebServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QEA_Cube {
	
WebDriver driver;
	
	By Services = By.xpath("//label[@for='toggle0']");
	By QEA = By.xpath("//p[contains(text(),'Quality Engineering and Assurance')]");
	By QEAHeadContent = By.xpath("(//h1[contains(text(),'Ensuring high-quality products and services throug')])[1]");
	By QAssuarance = By.xpath("//h5[normalize-space()='Quality Assurance']");
	By QAssHeadContent = By.xpath("(//h1[contains(text(),'Ensure seamless user journey through comprehensive')])[1]");
	By QEAssurance = By.xpath("(//a[normalize-space()='QEA'])[1]");
	
	
	public QEA_Cube(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void navigateToQEA() throws InterruptedException
	{
		driver.findElement(Services).click();
		driver.findElement(QEA).click();
		Thread.sleep(800);
		String expectedUrl = "https://cubesimple.com/services/quality-engineering-and-asurance/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
		String QEAContent = driver.findElement(QEAHeadContent).getText();
		assert QEAContent.startsWith("Ensuring high-quality");
			
	}
	
	public void clickOnQA() throws InterruptedException
	{
		driver.findElement(QAssuarance).click();
		Thread.sleep(200);
		String expectedUrl1 ="https://cubesimple.com/services/quality-engineering-and-asurance/quality-assurance/";
		String actualUrl1 = driver.getCurrentUrl();
		assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		String QAssContent = driver.findElement(QAssHeadContent).getText();
		assert QAssContent.startsWith("Ensure seamless user journey");
	}
	
	public void clickOnQEANaive()
	{
		driver.findElement(QEAssurance).click();
		String expectedUrl2 = "https://cubesimple.com/services/quality-engineering-and-asurance/";
		String actualUrl2 = driver.getCurrentUrl();
		assert actualUrl2.equals(expectedUrl2): "Expected URL: " + expectedUrl2 + ", but got " + actualUrl2;
		
	}


}
