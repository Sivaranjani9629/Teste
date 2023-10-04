package com.cubesitetest.CubeWebHome;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Home_Cube {
	
WebDriver driver;
	
	By ServiceOfferings = By.xpath("//h2[normalize-space()='Our Service Offerings']");
	By Animie = By.xpath("//button[@id='btn-back-to-top']");
	By ContactUs = By.xpath("(//a[normalize-space()='Contact Us'])[1]");
	By Cubelogo = By.xpath("//img[@alt='CubeSimple Logo']");


	public Home_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyHomepage()
	{
		String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
	}
	
	public void verifyContent()
	{
		String getHomeContent = driver.findElement(ServiceOfferings).getText();
		assertEquals("Our Service Offerings",getHomeContent );
		
	}
	
	public void scrollPage()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	 	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 	driver.findElement(Animie);	
	}
	
	public void navigateContactUs() throws InterruptedException
	{
		driver.findElement(ContactUs).click();
		Thread.sleep(800);
		driver.findElement(Cubelogo).click();
		Thread.sleep(900);
		String expectedUrl = "https://cubesimple.com/";
		String actualUrl = driver.getCurrentUrl();
		assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;
		String getHomeContent1 = driver.findElement(ServiceOfferings).getText();
		assertEquals("Our Service Offerings",getHomeContent1 );
		
		
	}

}
