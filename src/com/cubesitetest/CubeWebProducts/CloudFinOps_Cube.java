package com.cubesitetest.CubeWebProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloudFinOps_Cube {
WebDriver driver;
	
	By products = By.xpath("//label[contains(text(),'Products')]");
	By cloudfinops = By.xpath("//body/div[@id='__next']/nav[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/a[3]/div[2]/p[1]");
	By pageContent = By.xpath("//h3[normalize-space()='Why Cloud FinOps?']");
	
	public CloudFinOps_Cube(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void navigateToFinOps() throws InterruptedException {
		driver.findElement(products).click();
		Thread.sleep(1200);
		driver.findElement(cloudfinops).click();
		Thread.sleep(2000);
		String expectedUrl = "https://cubesimple.com/products/finops/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;
       }
	
	public void pagevalidation() {
		
		String pageContVal = driver.findElement(pageContent).getText();
		assert pageContVal.startsWith("Why Cloud");
		
	}

}
