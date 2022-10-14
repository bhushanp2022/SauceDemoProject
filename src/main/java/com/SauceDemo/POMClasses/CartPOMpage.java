package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPOMpage {
	private static final String HOW = null;
	
	WebDriver driver;
	
	public CartPOMpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(how = How.ID,using="checkout")
	WebElement checkoutButton;
	
	public void ClickCheckOutButton() {
		
		checkoutButton.click();
		
	}
	
	
	
	public String getTitleofContinuePage() {
		
   String ActualTitle=driver.getTitle();

      return ActualTitle;
	
	}
	
	
	
	
	
	
	
	
	

}
