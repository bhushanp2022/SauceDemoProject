package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPOMpage;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TC001_VerifyLoginFunctionality extends TestBaseClass{
  
   @Test    
   public void loginFunctionality() {
			   //Goes to Home page
			   //validation 
			   log.info("Applying The Validation");
			   String ExpectedTitle="Swag Labs";
			   String ActualTitle=driver.getTitle();
			   
			   Assert.assertEquals(ActualTitle,ExpectedTitle);
		
   
   }
			   
   }

			   
			   
		
		 
	