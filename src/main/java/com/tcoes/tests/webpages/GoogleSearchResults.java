package com.tcoes.tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * @Author: Anuragh Reddy
 * @Description: 
 *      Web Page Class Implementation using PageFactory Design Pattern. 
 * 	    We have Taken Google Home Page as the Application Under Test.
 * @Tools: Eclipse IDE,TestNG unit Framework,Maven
 * 
 */

public class GoogleSearchResults {
	
		private WebDriver driver;
		
		   /*
		    * Defining the locators.The below syntax is used to define WelElements on a web Page using 
		    * Page Object factory. We have used both the variants in defining the WebElements.
		    * 
		    */
		   
		   //Variant 01
		   @FindBy(how = How.ID, using = "resultStats")
		   private WebElement searchResultsStats;
		   
		   //Variant 02
		   @FindBy(css="#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div > div > div.f.kv._SWb")
		   private WebElement firstResultsLink;
	
	   /*
	    * The below code Snippet Does the Initialization of PageFacotry Inside the class constructor.
	    */
	   
	   public GoogleSearchResults(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   /*
	    * Method to return the Page title.
	    */
	   
	   public String getTitle()
	   {
		   return driver.getTitle();
	   }
	   
	   /*
	    * Method to return the number of results returned by Goolge Search
	    */
	   
	   public String getResultsStats()
	   {
	   return searchResultsStats.getText();
	   }
	   
	   /*
	    * Method to return first link returned by Google Search.
	    */
	   
	   public String getFirstResultsLink()
	   {
		   return firstResultsLink.getText();
	   }
	   
}
