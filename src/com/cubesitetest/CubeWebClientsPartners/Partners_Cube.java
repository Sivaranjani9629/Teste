package com.cubesitetest.CubeWebClientsPartners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Partners_Cube {
	
WebDriver driver;
	
	By ClientsPartners = By.xpath("//label[@for='toggle4']");
	By Partners = By.xpath("(//p[contains(text(),'Partners')])[1]");
	By Partner_ServiceNow = By.xpath("(//h1[normalize-space()='ServiceNow'])[1]");
	By Partner_Workday = By.xpath("(//h1[normalize-space()='Workday'])[1]");
	
	public Partners_Cube(WebDriver driver) {
	this.driver=driver;
	}
	
	public void navigateToPartners() throws InterruptedException
	{
		driver.findElement(ClientsPartners).click();
		driver.findElement(Partners).click();
		Thread.sleep(500);
		String expectedUrl = "https://cubesimple.com/clients-and-partners/partners/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void verifyContent()
	{
		String Servicenow = driver.findElement(Partner_ServiceNow).getText();
		assert Servicenow.contains("ServiceNow");
		String Workday = driver.findElement(Partner_Workday).getText();
		assert Workday.contains("Workday");
				
	}

}
