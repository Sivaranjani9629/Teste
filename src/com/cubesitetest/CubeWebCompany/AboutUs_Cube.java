package com.cubesitetest.CubeWebCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs_Cube {
	WebDriver driver;
	
	By Company = By.xpath("//label[@for='toggle5']");
	By Aboutus = By.xpath("(//p[contains(text(),'About Us')])[1]");
	By Headcontent = By.xpath("(//h1[contains(text(),'Transforming modern business to improve everyday l')])[1]");
	By PageContent = By.xpath("(//p[contains(text(),'Founded in 2020, we have since grown into a dynami')])[1]");
	
	public AboutUs_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigateToAboutUs() throws InterruptedException
	{
		driver.findElement(Company).click();
		Thread.sleep(2000);
		driver.findElement(Aboutus).click();
		Thread.sleep(2000);
		String expectedUrl = "https://cubesimple.com/company/about-us/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void verifyContent()
	{
		String headCont = driver.findElement(Headcontent).getText();
		assert headCont.contains("Transforming modern business");
		String pageCont = driver.findElement(PageContent).getText();
		assert pageCont.contains("Founded in 2020, we have since grown into a dynami");
	}
	
	

}
