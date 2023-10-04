package com.cubesitetest.CubeWebCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhyCube_Cube {
	
	WebDriver driver;
	
	By Company = By.xpath("//label[@for='toggle5']");
	By Whycube = By.xpath("(//p[contains(text(),'Why CubeSimple')])[1]");
	By HeadContent = By.xpath("(//h1[normalize-space()='Make the most of your ServiceNow investment!'])[1]");
	By PageContent = By.xpath("(//h1[normalize-space()='Empowering data-driven business decisions!'])[1]");
	
	public WhyCube_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToWhyCubeSimple() throws InterruptedException
	{
		driver.findElement(Company).click();
		driver.findElement(Whycube).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/company/why-cubesimple/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void verifyContent()
	{
		String headCont = driver.findElement(HeadContent).getText();
		assert headCont.startsWith("Make the");
		String pageCont = driver.findElement(PageContent).getText();
		assert pageCont.startsWith("Empowering data");
	}


}
