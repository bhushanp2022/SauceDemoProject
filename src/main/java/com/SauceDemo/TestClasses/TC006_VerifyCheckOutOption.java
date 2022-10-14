package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPOMpage;
import com.SauceDemo.POMClasses.HomePagePOM;

public class TC006_VerifyCheckOutOption extends TestBaseClass {

	
	@Test
	public void VerifyCheckoutButton() {
		
		HomePagePOM hp=new HomePagePOM(driver);
		hp.ClickOnBagAddToCartButton();
		log.info("user click on bag product");
		hp.ClickOnAddToCartBucket();
		log.info("user click on cartbucket");
		
		CartPOMpage cp=new CartPOMpage(driver);
		cp.ClickCheckOutButton();
		log.info("User click on checkout button");
		
		String expectedTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		Assert.assertEquals(expectedTitle, ActualTitle);
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
}
