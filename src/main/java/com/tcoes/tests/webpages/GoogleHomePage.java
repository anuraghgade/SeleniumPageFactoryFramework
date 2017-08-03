package com.tcoes.tests.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * @Author: Anuragh Reddy
 * @Description: 
 *               Web Page Class Implementation using PageFactory Design Pattern. 
 * 				 We have Taken Google Home Page as the Application Under Test.
 * @Tools: Eclipse IDE,TestNG unit Framework,Maven
 * 
 */

public class GoogleHomePage {
	private WebDriver driver;

	   /*
	    * Defining the locators.The below syntax is used to define WelElements on a web Page using 
	    * Page Object factory. We have used both the variants in defining the WebElements.
	    * 
	    */
	   
	   //Variant 01
	   @FindBy(how = How.ID, using = "lst-ib")
	   private WebElement googleSearchInputField;
	   
	   //Variant 02
	   @FindBy(xpath="//*[@id='tsf']/div[2]/div[3]/center/input[1]")
	   private WebElement googleSearchButton;

	   
	   /*
	    * The below code Snippet Does the Initialization of PageFacotry Inside the class constructor.
	    */
	   
	   public GoogleHomePage(WebDriver driver,String googleURL){
	       this.driver=driver;
	       driver.get(googleURL);
	       PageFactory.initElements(driver, this);
	   }
	   
	   /*
	    * Methods to Define the actions on the Web Elements.
	    * These Methods can be accessed to build the test scripts/work flow by Initializing the object of this class.
	    */

	   public void searchGoogle(String searchText){

		   googleSearchInputField.sendKeys(searchText);
		   clickgoogleSearchButton();
	   }
	   
	   public void clickgoogleSearchButton()
	   {
		   googleSearchButton.click();
	   }
}
