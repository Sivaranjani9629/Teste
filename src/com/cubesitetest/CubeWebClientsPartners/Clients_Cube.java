package com.cubesitetest.CubeWebClientsPartners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;


public class Clients_Cube {
	
WebDriver driver;
	
	By ClientsPartners = By.xpath("//label[@for='toggle4']");
	By Clients = By.xpath("(//p[contains(text(),'Clients')])[1]");
	By ClientContent = By.xpath("(//h3[normalize-space()='Trusted by leading brands'])[1]");
	By Brightspeed = By.xpath("//img[@src='/assets/images/client/brightspeed.svg']");
	By Equinix = By.xpath("//img[@src='/assets/images/client/equinix.svg']");
	
	public Clients_Cube(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void navigateToClientsPartners() throws InterruptedException
	{
		driver.findElement(ClientsPartners).click();
		driver.findElement(Clients).click();
		Thread.sleep(800);
		String expectedUrl = "https://cubesimple.com/clients-and-partners/clients/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(800);
		assert actualUrl.equals(expectedUrl): "Expected URL: " + expectedUrl + ", but got " + actualUrl;
	}
	
	public void verifyContent()
	{
		String PageContent = driver.findElement(ClientContent).getText();
		assert PageContent.startsWith("Trusted by leading");
		//To find the image Brightspeed
		WebElement imageBrightspeed = driver.findElement(Brightspeed);
		if(imageBrightspeed != null)
		{
			System.out.println("Brightspeed Image is present on the website");
		}else {
			System.out.println("Image is not present on the website");
		}
		//To find the image Equinix
		WebElement imageEquinix = driver.findElement(Equinix);
		if(imageEquinix!=null)
		{
			System.out.println("Equinix Image is present on the website");
		}
		else {
			System.out.println("Equinix Image is not present on the website");
		}
		
	}

}
