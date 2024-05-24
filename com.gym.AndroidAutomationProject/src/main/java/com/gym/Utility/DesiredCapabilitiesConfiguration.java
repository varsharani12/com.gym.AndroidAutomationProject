package com.gym.Utility;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utility.UtilityClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DesiredCapabilitiesConfiguration {
	
      Properties properties;
	  //  private static Map<String, AndroidDriver> mobileDriverPool = new HashMap();
	    static DesiredCapabilities capabilities;
	    AndroidDriver<AndroidElement> driver;

	    public AndroidDriver<AndroidElement> getAndroidDriver(String propertyPath) {
	        try {
	        	
	            properties = UtilityClass.loadProperties(propertyPath);
	            String platformVersion = properties.getProperty("platformVersion");
	            String deviceName = properties.getProperty("deviceName");
	            String nodeURL = properties.getProperty("nodeURL");
	            String appPackage = properties.getProperty("appPackage");
	            String automationName = properties.getProperty("automationName");
	            String appActivity = properties.getProperty("appActivity");
	            String platformName = properties.getProperty("platformName");
	            String app = properties.getProperty("apkPath");
	            String udid = properties.getProperty("udid");
	            capabilities=new DesiredCapabilities();
	            
	            capabilities.setCapability("platformVersion", platformVersion);
	            capabilities.setCapability("deviceName", deviceName);
	            capabilities.setCapability("appPackkage", appPackage);
	            capabilities.setCapability("automationName", automationName);
	            capabilities.setCapability("appActivity", appActivity);
	            capabilities.setCapability("platformName", platformName);
	            capabilities.setCapability("udid", udid);
	            capabilities.setCapability("autoGrantPermissions","true");
	            capabilities.setCapability("autoAcceptAlerts","true");
	            
	            URL url=new URL(nodeURL);
	            
	            capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//src//main//"+app);
	            return driver=new AndroidDriver<AndroidElement>(url,capabilities);
	               

	        }
	        catch(Exception e)
	        {
	        	System.out.println("Not able to create Android Driver"+e.getMessage());
	        }
	        return driver;
	    }

	}
	


