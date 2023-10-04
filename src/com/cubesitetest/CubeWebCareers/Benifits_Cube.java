package com.cubesitetest.CubeWebCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Benifits_Cube {
	WebDriver driver;
	
	By careers = By.xpath("//label[contains(text(),'Careers')]");
	By benifits = By.xpath("//p[contains(text(),'Our Culture and benefits')]");
	
	public Benifits_Cube(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void navigatingto_benifits()throws InterruptedException {
	driver.findElement(careers).click();
	driver.findElement(benifits).click();
	Thread.sleep(1000);
   
	WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'Discover opportunities to learn, grow and make a d')]"));
	 String actualText = element.getText();
	 String expectedText = "Discover opportunities to learn, grow and make a difference in your work.";
	 Thread.sleep(1000);
	 assert actualText.equals(expectedText): "Expected Text: " + expectedText + ", but got " + actualText;
   }
	public static boolean validateText(WebElement element, String expectedText) {
	        try {
	            String actualText = element.getText();
	            return actualText.equals(expectedText);
	        } catch (Exception e) {
	            return false;   
	        }
	}
	        
	
	 public void redidirect1() {
		 driver.navigate().back();
}
	 }