package com.cubesitetest.CubeWebResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blogs_Cube {
	
WebDriver driver;
	
	By Resources = By.xpath("//label[contains(text(),'Resources')]");
	By Blogs = By.xpath("(//p[contains(text(),'Blogs')])[1]");
	
	
	public Blogs_Cube(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToBlogs() throws InterruptedException
	{
		driver.findElement(Resources).click();
		Thread.sleep(2000);
		driver.findElement(Blogs).click();
		Thread.sleep(3000);
		String expectedUrl = "https://cubesimple.com/resources/blogs/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}

}
