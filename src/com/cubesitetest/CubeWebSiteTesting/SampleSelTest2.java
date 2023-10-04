package com.cubesitetest.CubeWebSiteTesting;

import org.testng.annotations.Test;

import com.cubesitetest.CubeWebFrameworks.ATF_Cube;
import com.cubesitetest.CubeWebFrameworks.GoldCube_Cube;
import com.cubesitetest.CubeWebFrameworks.War_Cube;
import com.cubesitetest.CubeWebResources.AllResources_Cube;
import com.cubesitetest.CubeWebResources.Blogs_Cube;
import com.cubesitetest.CubeWebResources.CaseStudies_Cube;

//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeOptions;
public class SampleSelTest2 {
	WebDriver driver;
	JavascriptExecutor js;
	Blogs_Cube blogs;
	CaseStudies_Cube casestudy;
	AllResources_Cube allres;
	War_Cube war;
	ATF_Cube atf;
	GoldCube_Cube goldcube;

	@BeforeTest
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVARANJANI S\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://cubesimple.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		war = new War_Cube(driver);
		atf = new ATF_Cube(driver);
		goldcube = new GoldCube_Cube(driver);
		blogs = new Blogs_Cube(driver);
		casestudy = new CaseStudies_Cube(driver);
		allres = new AllResources_Cube(driver);

	}
    @SuppressWarnings("static-access")
	@Test(priority =1)
    public void testWarCube_Frameworks() throws InterruptedException
    {
    	war.navigateTowarframework();
    	war.validateurl(null, null);
    	
    }
    @SuppressWarnings("static-access")
	@Test(priority = 2)
    public void testATF_Frameworks() throws InterruptedException
    {
    	atf.navigateToATFframework();
    	atf.validatUrl(null, null);
    }
    @SuppressWarnings("static-access")
	@Test(priority = 3)
    public void testGoldCube_Frameworks() throws InterruptedException
    {
    	goldcube.navigateToGoldframework();
    	goldcube.validateurl(null, null);
    }

	@Test(priority =4)
	public void testBlogs_Resources() throws InterruptedException {
		blogs.navigateToBlogs();
		Thread.sleep(1000);
	}

	@Test(priority =5)
	public void testCaseStudy_Resources() throws InterruptedException
	{
		casestudy.navigateCaseStudy();
		Thread.sleep(1000);

	}
	@Test(priority = 6)
	public void testAllResources_Resources() throws InterruptedException
	{
		allres.navigateToAllResources();
		Thread.sleep(800);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
