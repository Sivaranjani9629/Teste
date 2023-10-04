package com.cubesitetest.CubeWebSiteTesting;

import org.testng.annotations.Test;

//import com.cubesitetest.CubeWebHome.Home_Cube;
import com.cubesitetest.CubeWebProducts.CloudFinOps_Cube;
import com.cubesitetest.CubeWebProducts.CubeLens_Cube;
import com.cubesitetest.CubeWebProducts.CubeQual_Cube;
import com.cubesitetest.CubeWebServices.QEA_Cube;
import com.cubesitetest.CubeWebServices.Salesforce_Cube;
import com.cubesitetest.CubeWebServices.ServiceNow_Cube;
import com.cubesitetest.CubeWebServices.Workday_Cube;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class SampleSelTest1 {

	WebDriver driver;
	ServiceNow_Cube servicenow;
	Workday_Cube workday;
	Salesforce_Cube salesforce;
	QEA_Cube qea;
	CubeLens_Cube lens;
	CubeQual_Cube qual;
	CloudFinOps_Cube finops;
	//Home_Cube home;

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
		//home = new Home_Cube(driver);
		servicenow = new ServiceNow_Cube(driver);
		workday = new Workday_Cube(driver);
		salesforce = new Salesforce_Cube(driver);
		qea = new QEA_Cube(driver);
		lens = new CubeLens_Cube(driver);
		qual = new CubeQual_Cube(driver);
		finops = new CloudFinOps_Cube(driver);
	}
	
	

	@Test(priority = 1)
	public void testServiceNow_Services() throws InterruptedException {
		servicenow.navigateToServiceNow();
		Thread.sleep(500);
		servicenow.clickOnCSM();
	}
	@Test(priority = 2)
	public void testWorkday_Services() throws InterruptedException
	{
		workday.navigateToWorkday();
		workday.clickOnAdvisory();
	}
	@Test(priority = 3)
	public void testSalesforce_Services() throws InterruptedException
	{
		salesforce.navigateToSalesforce();
		salesforce.clickOnStartAssessment();
	}
	@Test(priority = 4)
	public void testQEA_Services() throws InterruptedException
	{
		qea.navigateToQEA();
		qea.clickOnQA();
		qea.clickOnQEANaive();
	}
	@Test(priority = 5)
	public void testCubeLens_Products() throws InterruptedException
	{
		lens.navigatingtoCubelens();
		lens.pagevalidation();
	}
	@Test(priority = 6)
	public void testCubeQual_Products() throws InterruptedException
	{
		qual.navigateToCubeQual();
		qual.redirectToHome();
	}
	@Test(priority = 7)
	public void testCloudFinOps_Products() throws InterruptedException
	{
		finops.navigateToFinOps();
		finops.pagevalidation();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
