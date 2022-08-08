package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.HomePagePOM;
import com.SauceDemo.POMClasses.LoginPOMpage;

public class VerifyUserAbleToCheckoutOrnot {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium tool\\Chrome extract\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				System.out.println("Browser is opened");
				driver.manage().window().maximize();
				 System.out.println("Browser is Maximized");
				 driver.get("https://www.saucedemo.com/");
			      System.out.println("URL is opened");
		
			  
			  //Login Activity
			  LoginPOMpage lp=new LoginPOMpage(driver);
			  lp.sendUsername();
			  lp.sendPassword();
			  lp.clickLoginButton();
			  //HomePage
			  HomePagePOM hp=new HomePagePOM(driver);
			  hp.ClickOnBagAddToCartButton();
			  hp.ClickOnAddToCartBucket();
			  
			  
			  
			  
			  
    	
    	
    	
    	
    	
	}
	
	
}
