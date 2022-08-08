package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOM;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class TC005_VerifyFilterDropDownButton extends TestBaseClass{
	@Test
	public void filterDropDownMethod() throws IOException {
		//HomePage
		HomePagePOM hp=new HomePagePOM(driver);
		hp.ClickOnFilterDropdown();
	
		log.info("User Clicked on DropDown and Selected An option");
		ScreenShotClass.takeScreenShot(driver);
		log.info("ScreenShot Taken");
		//Validation 
		log.info("Apply Validation");
	  String ExpectedText="Name (Z to A)";
		String ActaulText=hp.getTextOfFilterDropDown();
		System.out.println(ActaulText);
		Assert.assertEquals(ActaulText, ExpectedText,"Text is not matching");
	}

}
