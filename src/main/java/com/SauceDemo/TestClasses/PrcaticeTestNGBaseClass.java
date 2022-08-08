package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.HomePagePOM;
import com.SauceDemo.POMClasses.LoginPOMpage;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class PrcaticeTestNGBaseClass {
	 WebDriver driver;
	   @BeforeClass
	 public void beforeClassMethod(){
		   //Launch Browser
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium tool\\Chrome extract\\chromedriver.exe");
					
					 driver=new ChromeDriver();
					System.out.println("Browser is opened");
					driver.manage().window().maximize();
					 System.out.println("Browser is Maximized");
					 driver.get("https://www.saucedemo.com/");
				      System.out.println("URL is opened");
				
	   }  
		@BeforeMethod
		public void beforeMethod() throws InterruptedException {
	   //LoginActivity 
				   LoginPOMpage lp=new LoginPOMpage(driver);
				   
				   lp.sendUsername();
				   System.out.println("Enter the Username");
				   lp.sendPassword();
				   System.out.println("Enter the password");
				   lp.clickLoginButton();
				   System.out.println("Click on LoginButton");
				   System.out.println("User Login Successfully");
				   Thread.sleep(5000);
				  
	   }
	   
	   @AfterMethod
		public void afterMethod() throws IOException{	
		   //LogOut Activity
		   HomePagePOM hp=new HomePagePOM(driver);
			  hp.ClickOnSettingButton();
			  System.out.println("Click on Setting button");
			  hp.ClickOnLogoutButton();
			  System.out.println("Click on Logout Button");
			  ScreenShotClass.takeScreenShot(driver);	 
				   
		}
	   @AfterClass
	   public void afterClass() {
		   
		   //Close Browser
		   driver.quit();
		   System.out.println("Browser Closed");
		   
		   
	   }
	
	
	

}
