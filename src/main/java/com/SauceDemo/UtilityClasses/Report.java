package com.SauceDemo.UtilityClasses;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Report {
   static ExtentReports extent;
   static ExtentTest test;
   
   @BeforeTest
   public void StartReport() {
	
   }
   
}
