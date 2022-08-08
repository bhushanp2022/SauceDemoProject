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

public class TC002_VerifyLogoutFunctionality extends TestBaseClass {
	@Test
	public void logoutFunctionality() throws IOException
	{
		
			  //HomePage 
			  HomePagePOM hp=new HomePagePOM(driver);
			  hp.ClickOnSettingButton();
			  log.info("Click on Setting button");
			  hp.ClickOnLogoutButton();
			  log.info("Click on Logout Button");
			  ScreenShotClass.takeScreenShot(driver);
			  log.info("ScreenShot Taken");
			  //Validation 
			  log.info("Applying Validation");
			  String ActualTitle=driver.getTitle();   
			  String ExpectedTitle="Swag Labs";
			
			  Assert.assertEquals(ActualTitle,ExpectedTitle ,"Titles not matching");
			  
			
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		
		
		
	}

}
