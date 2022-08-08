package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOM;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

public class PracticeTestNGTestClass extends PrcaticeTestNGBaseClass{
	
	@Test(priority=-1)
	public void verifyAddTocartForOneProduct() throws IOException {
		
		  //HomePage
		  HomePagePOM hp=new HomePagePOM(driver);
		  hp.ClickOnBagAddToCartButton();
		  
		  System.out.println("Clicked on BagAddToCart Button");
		  ScreenShotClass.takeScreenShot(driver);
		  //Validation
		  System.out.println("Applying Validation");
		  String ActualCount=hp.getTextOfAddToCartBucket();
		  String ExpectedCount="1";
		  
		  if(ActualCount.equals(ExpectedCount)) {
			  System.out.println("TC is passed");
		  }
		  else {
			  System.out.println("TC is Failed");
		  }
	}
	@Test
	public void addtocartForMultipleProducts() throws IOException {
			  //homepage
			  HomePagePOM hp=new HomePagePOM(driver);
			  hp.clickAllproducts();
			  System.out.println("Clicked On All products");
			  ScreenShotClass.takeScreenShot(driver);
			  
			  //validation
			  System.out.println("Applying Validation");
			 String ActualCount=hp.getTextOfAddToCartBucket();
			  String ExpectedCount="6";
			  if(ActualCount.equals(ExpectedCount)) {
				  
				  System.out.println("TC is passed ");
			  }
			  
			  else {
				  System.out.println("TC Is Failed");
			  }
		  }		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	

}
