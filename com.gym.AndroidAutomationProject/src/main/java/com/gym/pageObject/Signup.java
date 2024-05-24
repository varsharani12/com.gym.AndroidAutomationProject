package com.gym.pageObject;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Signup extends BasePageClass {

	AndroidDriver<AndroidElement> driver;
	
	//Intilaization of elements
	public static final String Popop=".//android.widget.Button[@text='Allow']";
	
	
	
	//Decleartation of elements
	@FindBy(xpath=Popop)
	MobileElement popop;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("rawtypes")
	public Signup(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

   //Utilization of elements
	public void clickOnPopop() throws InterruptedException
	{
		Thread.sleep(2000);
		popop.click();
	}
			     
			     
}	  
			     
	
			    
	
			    
			     
	              
			        
			      
			    
		

	


