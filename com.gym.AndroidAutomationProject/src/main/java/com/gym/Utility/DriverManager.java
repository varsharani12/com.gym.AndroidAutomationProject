package com.gym.Utility;

import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    static Properties properties;
    @SuppressWarnings("rawtypes")
	public static AndroidDriver driver;
    static DesiredCapabilities capabilities;

    @SuppressWarnings("rawtypes")
	public static AndroidDriver getDriver(DriverManagerType browserName) throws Exception {
        switch (browserName.getDriver()) {
            case "AndroidDriver":
            
                String propertyPath = System.getProperty("user.dir") + "//resources//apk//android.properties";
                return driver = new DesiredCapabilitiesConfiguration().getAndroidDriver(propertyPath);

        }
        return null;
    }

}

