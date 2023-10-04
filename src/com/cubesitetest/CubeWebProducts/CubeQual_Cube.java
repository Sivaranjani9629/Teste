package com.cubesitetest.CubeWebProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CubeQual_Cube {
	
WebDriver driver;
	
	By products = By.xpath("//label[contains(text(),'Products')]");
	By cubequal = By.xpath("//p[contains(text(),'Pre-built software testing platform to produce hig')]");
	By talkToUs = By.xpath("(//a[normalize-space()='Talk To Us'])[1]");
	By cubeLogo = By.xpath("//img[@alt='CubeSimple Logo']");
	
	public CubeQual_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	public void navigateToCubeQual() throws InterruptedException {
		driver.findElement(products).click();
		Thread.sleep(800);
		driver.findElement(cubequal).click();
		Thread.sleep(1200);
		String expectedUrl = "https://cubesimple.com/products/cubequal/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	/*public void pagevalidation() throws InterruptedException 
	{
		
		driver.findElement(talkToUs).click();
		Thread.sleep(1200);
		String expectedUrl1 = "https://cubesimple.com/contact-us/";
		String actualUrl1 = driver.getCurrentUrl();
		//Thread.sleep(800);
		assert actualUrl1.equals(expectedUrl1) : "Expected URL: " + expectedUrl1 + ", but got " + actualUrl1;
		
	}*/
	public void redirectToHome() throws InterruptedException
	{
		driver.findElement(cubeLogo).click();
		Thread.sleep(800);
		String expectedUrl2 = "https://cubesimple.com/";
		String actualUrl2 = driver.getCurrentUrl();
		//Thread.sleep(800);
		assert actualUrl2.equals(expectedUrl2) : "Expected URL: " + expectedUrl2 + ", but got " + actualUrl2;
	}

}
