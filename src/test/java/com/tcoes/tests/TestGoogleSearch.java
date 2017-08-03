package com.tcoes.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tcoes.tests.webpages.*;
/*
 * @Author: Anuragh Reddy
 * @Description: 
 *        This Test class has the implementation of 2 test methods against Google.com.
 * @Tools: Eclipse IDE,TestNG unit Framework,Maven       
 */

public class TestGoogleSearch {
	
	private WebDriver driver;
	
	/*
	 * Initializing the Firefox Driver using geckodriver library. 
	 * @BeforeClass is a TestNg Annotation.
	 */
	
	
	@BeforeClass
	public void setUpTestBed()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 *The below test method searches whether the test results stats are displayed for the given Search Text on Google Search results Page
	 * The Values of Parameters "googleURL" "searchText" are defined in the testng.xml
	 */
	
	@Parameters({"googleURL", "searchText"})
	@Test
	public void testSearchStats(String googleURL,String searchText )
	{
		GoogleHomePage page = new GoogleHomePage(driver,googleURL);
		page.searchGoogle(searchText);
		GoogleSearchResults resultsPage =new GoogleSearchResults(driver);		
		Assert.assertNotNull(resultsPage.getResultsStats());
		Assert.assertEquals(resultsPage.getTitle(),searchText+" - Google Search");
				
	}
	
	/*
	 *The below test method searches and retrieves the first link on the Search results page of Google.com
	 *
	 */
	
	@Parameters({"googleURL", "searchText"})
	@Test
	public void testSearchLinks (String googleURL,String searchText)
	{
		GoogleHomePage page = new GoogleHomePage(driver,googleURL);
		page.searchGoogle(searchText);
		GoogleSearchResults resultsPage =new GoogleSearchResults(driver);
		System.out.println(resultsPage.getFirstResultsLink());
		Assert.assertNotNull(resultsPage.getFirstResultsLink());
	}
	
	/*
	 * @AfterClass Annotation is used to call routines to restore the state of application like
	 * a. Close Open Browser Windows
	 * b. Close database connections
	 * c. Close file handlers and delete the setup data. etc.
	 */
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
