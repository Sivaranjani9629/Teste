package com.cubesitetest.CubeWebCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class News_Cube {
	WebDriver driver;
	
	By Company = By.xpath("//label[@for='toggle5']");
	By News = By.xpath("(//p[contains(text(),'News')])[1]");
	By Blogs = By.xpath("//div[contains(@class,'py-2')]//a[contains(@class,'border bg-orange-500 rounded-full mb-2 text-white text-md border-orange-300 px-6 py-3')][normalize-space()='Read more']");
	By CaseStudy = By.xpath("(//a[contains(@href,'/resources/case-studies/')][normalize-space()='Read more'])[1]");
	By Guide = By.xpath("//a[contains(@href,'/resources/blogs/salesforce-reports/')]");
	
	public News_Cube(WebDriver driver)
	{
		this.driver=driver;
	}

	public void navigateToNews() throws InterruptedException
	{
		driver.findElement(Company).click();
		Thread.sleep(1200);
		driver.findElement(News).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/resources/all-resources/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
				
	}
	
	public void navigateToBlogs() throws InterruptedException
	{
		driver.findElement(Blogs).click();
		Thread.sleep(2000);
		String expectedUrl1 = "https://cubesimple.com/resources/blogs/";
		String actualUrl1 = driver.getCurrentUrl();
		Thread.sleep(2000);
		assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		driver.navigate().back();
		Thread.sleep(200);
		//assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void navigateToCaseStudy() throws InterruptedException
	{
		driver.findElement(CaseStudy).click();
		Thread.sleep(2000);
		String expectedUrl2 = "https://cubesimple.com/resources/case-studies/";
		String actualUrl2 = driver.getCurrentUrl();
		Thread.sleep(2000);
		assert actualUrl2.equals(expectedUrl2): "Expected URL: " + expectedUrl2 + ", but got " + actualUrl2;
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	
	public void navigateToGuide() throws InterruptedException
	{
		driver.findElement(Guide).click();
		Thread.sleep(2000);
		String expectedUrl3 = "https://cubesimple.com/resources/blogs/salesforce-reports/";
		String actualUrl3 = driver.getCurrentUrl();
		Thread.sleep(1000);
		assert actualUrl3.equals(expectedUrl3): "Expected URL: " + expectedUrl3 + ", but got " + actualUrl3;
		driver.navigate().back();
		Thread.sleep(1000);
		//assert actualUrl1.equals(expectedUrl1): "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		
	}
}
