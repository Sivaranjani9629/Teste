package com.cubesitetest.CubeWebClientsPartners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessStories_Cube {
WebDriver driver;
	
	By ClientsPartners = By.xpath("//label[@for='toggle4']");
	By Successstories = By.xpath("//p[contains(text(),'Explore how we overcome problem statements and')]");
	By PageContent = By.xpath("(//h1[normalize-space()='Vertical Analysis & Rollout'])[1]");
	
	public SuccessStories_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigateToStory() throws InterruptedException
	{
		driver.findElement(ClientsPartners);
		Thread.sleep(2000);
		driver.findElement(Successstories).click();
		Thread.sleep(400);
		String expectedUrl = "https://cubesimple.com/resources/case-studies/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void verifyContent()
	{
		String content = driver.findElement(PageContent).getText();
		assert content.contains("Vertical Analysis");
	}


}
