package com.cubesitetest.CubeWebCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CultureValues_Cube {
	WebDriver driver;
	
	By Company = By.xpath("//label[@for='toggle5']");
	By CultureValues = By.xpath("(//p[contains(text(),'Culture & Values')])[1]");
	By PageContent = By.xpath("(//h2[normalize-space()='Life at CubeSimple'])[1]");
	
	
	public CultureValues_Cube(WebDriver driver)
	{
		this.driver=driver;
	}

	public void navigateToCultureValues() throws InterruptedException
	{
		driver.findElement(Company).click();
		driver.findElement(CultureValues).click();
		Thread.sleep(300);
		String expectedUrl = "https://cubesimple.com/company/culture-and-values/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
				
	}
	public void verifyContent()
	{
		String pageCont = driver.findElement(PageContent).getText();
		assert pageCont.contains("CubeSimple");
	}
}
