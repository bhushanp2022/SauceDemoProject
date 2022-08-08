package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOM;
import com.SauceDemo.POMClasses.LoginPOMpage;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TC003_VerifyAddTocartForOneProduct extends TestBaseClass{
	
	@Test
	public void verifyAddTocartForOneProduct() throws IOException, InterruptedException{
	
			  //HomePage
			  HomePagePOM hp=new HomePagePOM(driver);
			  hp.ClickOnBagAddToCartButton();
			  Thread.sleep(5000);
			  log.info("Clicked on BagAddToCart Button");
			  ScreenShotClass.takeScreenShot(driver);
			  log.info("ScreenShot Taken");
			  //Validation
			  log.info("Applying Validation");
			  String ActualCount=hp.getTextOfAddToCartBucket();
			  String ExpectedCount="1";
	Assert.assertEquals(ActualCount, ExpectedCount,"Count Doesn't Match");	
	
	}
			  
			
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		
		
	}

