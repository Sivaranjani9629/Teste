package com.cubesitetest.CubeWebCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Internship_Cube {
	WebDriver driver;

	By careers = By.xpath("//label[contains(text(),'Careers')]");
	By internship = By.xpath("//p[contains(text(),'Internships and Entry Level')]");

	public Internship_Cube(WebDriver driver)
	{   
		this.driver=driver;
	}

	public void navigatingto_internship() throws InterruptedException {
		driver.findElement(careers).click();
		driver.findElement(internship).click();
		Thread.sleep(2000);
		String expectedUrl = "https://cubesimple.com/contact-us/";
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(500);
		assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + ", but got " + actualUrl;


	}
	public static boolean validateurl(WebElement element, String expectedText) {
		try {
			String actualText = element.getText();
			return actualText.equals(expectedText);
		} catch (Exception e) {
			return false;   
		}        	
	}
	public void redidirect2() {
		driver.navigate().back();
	}
}
