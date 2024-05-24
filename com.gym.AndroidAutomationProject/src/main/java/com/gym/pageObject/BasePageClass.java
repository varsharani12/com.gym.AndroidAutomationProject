package com.gym.pageObject;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

class BasePageClass{
	
    @SuppressWarnings("rawtypes")
	public static AndroidDriver androidDriver;

	AndroidDriver<AndroidElement> driver;
	

	
	
	@SuppressWarnings("static-access")
	public BasePageClass(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		this.androidDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	

	}
	}