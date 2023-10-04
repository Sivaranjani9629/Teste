package com.cubesitetest.CubeWebProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CubeLens_Cube {
WebDriver driver;
	
	By products = By.xpath("//label[contains(text(),'Products')]");
	By cubelens = By.xpath("(//p[contains(text(),'CubeLens')])[1]");
	By cubelens1 = By.xpath("//a[@class='hover:underline'][normalize-space()='CubeLens']");
    By pageHeadContent = By.xpath("(//h4[contains(text(),'Convert your raw data into processed compelling vi')])[1]");
	
    public CubeLens_Cube(WebDriver driver)
    {
    	this.driver=driver;
    }

    public void navigatingtoCubelens() throws InterruptedException 
    {
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   //driver.findElement(cubelens).click();
	   Thread.sleep(2000);
	   driver.findElement(cubelens1).click();
	   //driver.findElement(cubelens).click();
	   Thread.sleep(1200);
	   String expectedUrl = "https://cubesimple.com/products/cubelens/";
	   String actualUrl = driver.getCurrentUrl();
	   Thread.sleep(500);
	   assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}

    public void pagevalidation() throws InterruptedException 
    {
	   String pageHeadcontent = driver.findElement(pageHeadContent).getText();
	   Thread.sleep(500);
	   assert pageHeadcontent.contains("Convert your raw data");
    }

}
