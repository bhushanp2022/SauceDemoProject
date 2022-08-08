package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM {
	
	private WebDriver driver;
	private Select s;
	
   //Setting Button
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement SettingButton;
	 
	public void ClickOnSettingButton() {
		
		SettingButton.click();
		
	}
	
	//LogOut button
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOutButton;
    
	public void ClickOnLogoutButton() {
		
		LogOutButton.click();
		
	}
	//BagAddToCartButton
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement BagAddToCartButton;
	
	public void  ClickOnBagAddToCartButton(){
		
		BagAddToCartButton.click();
	}
	//AddToCartBucket
	@FindBy(xpath="//div[@class='shopping_cart_container']")
	private WebElement AddToCartBucket;
	
	public void ClickOnAddToCartBucket() {
		
		AddToCartBucket.click();
	}
	
	public String getTextOfAddToCartBucket() {
		String TotalProducts =AddToCartBucket.getText();
		return TotalProducts;
	}
	//multiple product elements
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private List<WebElement> multipleAddTocartbutton;
	
	//Use For Each loop to click all products
	public void clickAllproducts()
	{
	 for(WebElement Products: multipleAddTocartbutton) {
		 
		 Products.click();
	
	 }
	}
	//Filter DropDown
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement FilterDropdown;
	
	public void ClickOnFilterDropdown() {
		FilterDropdown.click();
		s.selectByVisibleText("Name (Z to A)");
	}
	//GetText of filterdropdown
      public String getTextOfFilterDropDown() {
    	  List<WebElement> options=s.getOptions();
    	  String TextValues=options.get(1).getText();
    	  return TextValues;
      }
	
	
	
	//Constructor
	public HomePagePOM(WebDriver driver) 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		s=new Select(FilterDropdown);
	}
	
	
	
	
	

}
