package com.cubesitetest.CubeWebCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leadership_Cube {
	
	WebDriver driver;
	
	By Company = By.xpath("//label[@for='toggle5']");
	By Leadership = By.xpath("(//p[contains(text(),'Leadership')])[1]");
	
	public Leadership_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigateToLeadership() throws InterruptedException
	{
		driver.findElement(Company).click();
		driver.findElement(Leadership).click();
		Thread.sleep(300);
		String expectedUrl = "https://cubesimple.com/company/leadership/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}

}
