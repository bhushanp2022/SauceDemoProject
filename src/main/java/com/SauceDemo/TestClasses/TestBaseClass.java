package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPOMpage;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TestBaseClass {
	  WebDriver driver;
	  Logger log=Logger.getLogger("SauceDemoMavenProjectt");
	  
	 
	   @Parameters("BrowserName")
	   @BeforeMethod
	  public void setUp(String BrowserName) throws IOException, InterruptedException {
			
		   if(BrowserName.equals("chrome")){System.setProperty("webdriver.chrome.driver",
					"./Drivers/chromedriver106.exe");
					driver=new ChromeDriver();}
					
		   else if(BrowserName.equals("firefox")){ System.setProperty("webdriver.gecko.driver",
							"./Drivers/geckodriver.exe");
							driver=new FirefoxDriver();			
		   }
		   else {
			   System.out.println("Throw error");
		   }
		   
		   PropertyConfigurator.configure("log4j.properties");
					log.info("Browser is opened");
					driver.manage().window().maximize();
					 log.info("Browser is Maximized");
					 driver.get("https://www.saucedemo.com/");
				      log.info("URL is opened");
				  driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				     
		          //LoginActivity 
				   LoginPOMpage lp=new LoginPOMpage(driver);
				   
				   lp.sendUsername();
				   log.info("Enter the Username");
				   lp.sendPassword();
				   log.info("Enter the password");
				   lp.clickLoginButton();
				   log.info("Click on LoginButton");
				   log.info("User Login Successfully");
				   Thread.sleep(2000);
				  
	   }
	   
//	   @AfterMethod
//		public void tearDown() {		   
//				   //Close Browser
//				   driver.quit();
//				   log.info("Browser Closed");
//				   
//		}
//	   
	   
	   

}
