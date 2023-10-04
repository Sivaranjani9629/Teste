package com.cubesitetest.CubeWebSiteTesting;

import org.testng.annotations.Test;

import com.cubesitetest.CubeWebCareers.Benifits_Cube;
import com.cubesitetest.CubeWebCareers.Internship_Cube;
import com.cubesitetest.CubeWebCareers.Oportunities_Cube;
import com.cubesitetest.CubeWebClientsPartners.Clients_Cube;
import com.cubesitetest.CubeWebClientsPartners.Partners_Cube;
import com.cubesitetest.CubeWebClientsPartners.SuccessStories_Cube;
import com.cubesitetest.CubeWebCompany.AboutUs_Cube;
import com.cubesitetest.CubeWebCompany.CultureValues_Cube;
import com.cubesitetest.CubeWebCompany.Leadership_Cube;
import com.cubesitetest.CubeWebCompany.News_Cube;
import com.cubesitetest.CubeWebCompany.WhyCube_Cube;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class SampleSelTest3 {
	
	WebDriver driver;
	Clients_Cube clients;
	Partners_Cube partners;
	SuccessStories_Cube sstory;
	AboutUs_Cube aboutus;
	CultureValues_Cube culturevalues;
	Leadership_Cube leadership;
	News_Cube news;
	WhyCube_Cube whycube;
	Benifits_Cube benifits;
	Oportunities_Cube oportunities;
	Internship_Cube internship;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVARANJANI S\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://cubesimple.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		clients = new Clients_Cube(driver);
		partners = new Partners_Cube(driver);
		sstory = new SuccessStories_Cube(driver);
		aboutus = new AboutUs_Cube(driver);
		whycube = new WhyCube_Cube(driver);
		leadership = new Leadership_Cube(driver);
		culturevalues = new CultureValues_Cube(driver);
		news = new News_Cube(driver);
		benifits = new Benifits_Cube(driver);
		oportunities = new Oportunities_Cube(driver);
		internship = new Internship_Cube(driver);
  }
  
  @Test(priority = 1)
  public void testClient_ClientPartners() throws InterruptedException {
	  clients.navigateToClientsPartners();
	  clients.verifyContent();
  }
  @Test(priority = 2)
  public void testPartners_ClientPartners() throws InterruptedException
  {
	  partners.navigateToPartners();
	  partners.verifyContent();
  }
  @Test(priority = 3)
  public void testSuccessStory_ClientPartners() throws InterruptedException
  {
	  sstory.navigateToStory();
	  sstory.verifyContent();
  }
  @Test(priority = 4)
  public void testAboutUs_Company() throws InterruptedException
  {
	  aboutus.navigateToAboutUs();
	  aboutus.verifyContent();
  }
  @Test(priority = 5)
  public void testWhyCubeSimple_Company() throws InterruptedException
  {
	  whycube.navigateToWhyCubeSimple();
	  whycube.verifyContent();
  }
  @Test(priority = 6)
  public void testLeadership_Company() throws InterruptedException
  {
	  leadership.navigateToLeadership();
  }
  @Test(priority = 7)
  public void testCultureValues_Company() throws InterruptedException
  {
	  culturevalues.navigateToCultureValues();
	  culturevalues.verifyContent();
  }
  @Test(priority = 8)
  public void testNews_Company() throws InterruptedException
  {
	  news.navigateToNews();
	  news.navigateToBlogs();
	  news.navigateToCaseStudy();
	  news.navigateToGuide();
  }
  @SuppressWarnings("static-access")
  @Test(priority = 9)
  public void testBenifits_Careers() throws InterruptedException
  {
	  benifits.navigatingto_benifits();
	  benifits.validateText(null, null);
	  benifits.redidirect1();
  }
  @SuppressWarnings("static-access")
  @Test(priority = 10)
  public void testOportunities_Carerrs() throws InterruptedException
  {
	  oportunities.navigatingto_oportunities();
	  oportunities.validateText(null, null);
	  oportunities.redidirect3();
  }
  @SuppressWarnings("static-access")
  @Test(priority = 11)
  public void testInternship_Careers() throws InterruptedException
  {
	  internship.navigatingto_internship();
	  internship.validateurl(null, null);
	  internship.redidirect2();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
