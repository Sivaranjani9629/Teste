package com.cubesitetest.CubeWebServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServiceNow_Cube {
WebDriver driver;
	
	By Services = By.xpath("//label[@for='toggle0']");
	By ServiceNow = By.xpath("//p[@class='text-md font-semibold tracking-wide'][normalize-space()='ServiceNow']");
	By HeaderContent = By.xpath("(//h1[contains(text(),'ServiceNow - The platform for all platforms & appl')])[1]");
	By CSM = By.xpath("(//a)[60]");
	
	
	public ServiceNow_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToServiceNow()
	{
		driver.findElement(Services).click();
		driver.findElement(ServiceNow).click();
		String expectedUrl = "https://cubesimple.com/services/service-now/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;
		//validate the content in ServiceNow page
		String ServiceNowContent = driver.findElement(HeaderContent).getText();
		assert ServiceNowContent.startsWith("ServiceNow - The platform for");
	}
	
	public void clickOnCSM() throws InterruptedException
	{
		driver.findElement(CSM).click();
		Thread.sleep(3000);
		String expectedUrl1 = "https://cubesimple.com/services/service-now/customer-service-management/";
		String actualUrl1 = driver.getCurrentUrl();
		assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		driver.navigate().back();
	}


}
