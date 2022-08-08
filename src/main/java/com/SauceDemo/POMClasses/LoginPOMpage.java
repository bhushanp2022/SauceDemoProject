package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpage {
	
	//WebElement maintain
	//WebElement Action maintain
	//We will not run this 
	//Supply purpose 
	
	
     //WebDriver Declared
	private WebDriver driver;
	private Actions act;
	//Elements to be maintain
	//Username,password,login button
	
	//Element inspect 
	//@FindBy-->@-annotation->method function
       @FindBy(xpath="//input[@id='user-name']")	
      private WebElement username;
	
       //action on element
       public void sendUsername() {
    	   
    	   username.sendKeys("standard_user");
       }
       
       //password
       @FindBy(xpath="//input[@placeholder='Password']")
      private WebElement password;
       
       //action
       public void sendPassword() {
    	   password.sendKeys("secret_sauce");
    	   
       }
       
       //login button
       @FindBy(xpath="//input[@value='Login']")
       private WebElement loginButton;
       //Normal click process-webelement method
       public void clickLoginButton() {
    	   loginButton.click();
       }
       
       //Mouse Action Click method
//       public void clickonLoginButton() {
//    	   act.click(loginButton).perform();
//    	   
//       }
       
       
       
       
       
       
       //Constructor declare
       public LoginPOMpage(WebDriver driver) {
    	    //global     local
    	   this.driver=driver;
    	   
    	   //selenium class
    	   PageFactory.initElements(driver, this);
    	   
    	   //Actions act initialize
    	   act=new Actions(driver);
    	   
    	   
       }
       
       
       //POM class
       //1.WebDriver Declared globally
       //2.@FindBy-element find
       //3.method-element action
       //4.Constructor-global and local driver ,pagefactory 
       
       
       
       
       
       
       
       
       
       
       
       
       
}


