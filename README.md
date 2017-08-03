# Selenium Page Factory Framework (AKA . Extended Page Object Model) 

* @Author : Anuragh Reddy Gade
* @Version : v1.1

Automation Developers can  download this framework and start writing your scripts. This framework provides basic project setup ,configuration and Implementation level details on how to proceed with Page Factory Model. 

Tools Used:
1. TestNG
2. Selenium 3.4
3. Maven 
4. geckodriver
5. Maven SureFire Reports

For the purpose of Illustration of details on PageFactory and How it is used,I have considered writing few tests on Google.come Home Page
There are 2 tests that do the following

1. verify the search statistics are displayed on the GoogleSerachResults Page. (i.e Number of search results)
2. Verify that the first search result URL is not Empty.

Obvisiouly you can implement more tests but for those who want to get started on Writing selenium tests,this would be a great starting point.

Feel free to Download and Contribut to this Framework. 

Clone Repo:

1. Create a Directory SeleniumPageFactoryFramework
2. cd SeleniumPageFactoryFramework
3. git clone  https://github.com/anuraghgade/SeleniumPageFactoryFramework.git

Pre-requisites:


Configure geckoDriver:

Download GeckoDriver : https://github.com/mozilla/geckodriver/releases
Set -Dwebdriver.gecko.driver value to the geckodriver executable.Other wise you run into the below Issue

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Tests run: 4, Failures: 1, Errors: 0, Skipped: 3, Time elapsed: 1.185 sec <<< FAILURE! - in TestSuite
setUpTestBed(com.tcoes.tests.TestGoogleSearch)  Time elapsed: 0.811 sec  <<< FAILURE!
java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.gecko.driver 
system property; for more information, see https://github.com/mozilla/geckodriver. 
The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases
	at com.tcoes.tests.TestGoogleSearch.setUpTestBed(TestGoogleSearch.java:25)


Results :

Failed tests: 
  TestGoogleSearch.setUpTestBed:25 » IllegalState The path to the driver executa...

Tests run: 4, Failures: 1, Errors: 0, Skipped: 3

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.170 s
[INFO] Finished at: 2017-08-02T14:36:04-07:00
[INFO] Final Memory: 13M/309M




Contribute:

Use 

Eclipse IDE:
1.Import the Existing files as Maven Project into Eclipse.

or 

Intellij IDEA