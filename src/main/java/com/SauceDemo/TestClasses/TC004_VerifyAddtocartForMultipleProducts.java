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

public class TC004_VerifyAddtocartForMultipleProducts extends TestBaseClass{
    @Test  
	public void addtocartForMultipleProducts() throws IOException {
			  //homepage
			  HomePagePOM hp=new HomePagePOM(driver);
			  hp.clickAllproducts();
			  log.info("Click On All products");
			  ScreenShotClass.takeScreenShot(driver);
			  log.info("ScreenShot Taken");
			  //validation
			 log.info("Applying Validation");
			  String ActualCount=hp.getTextOfAddToCartBucket();
			  String ExpectedCount="6";
		Assert.assertEquals(ActualCount, ExpectedCount,"Count Doesn't match");
			  

			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		
		
		
	}
	
}
