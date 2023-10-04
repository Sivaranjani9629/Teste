package com.cubesitetest.CubeWebCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Oportunities_Cube {
WebDriver driver;
	
	By careers = By.xpath("//label[contains(text(),'Careers')]");
	By oportunities = By.xpath("//p[contains(text(),'Explore Opportunities')]");
	
public Oportunities_Cube(WebDriver driver)
{   this.driver=driver;
	}
	
public void navigatingto_oportunities() throws InterruptedException {
	driver.findElement(careers).click();
	Thread.sleep(2000);
	driver.findElement(oportunities).click();
	Thread.sleep(2000);

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
	 public void redidirect3() {
		 driver.navigate().back();
		
		 
}

}
