package SmokeTestcases;

import org.testng.annotations.BeforeTest;
import com.gym.Utility.DriverManager;
import com.gym.Utility.DriverManagerType;
import com.gym.pageObject.Signup;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest
	{
		public static AndroidDriver driver;
		
Signup signup;

	@BeforeTest
	public void setUp() throws Throwable {
		try {
			driver = DriverManager.getDriver(DriverManagerType.ANDROID);
			// Smoke Testing
			signup =new Signup((AndroidDriver )driver);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
//
//	@AfterMethod
//	public void destroyDriver() {
//		 driver.quit();
//
//	}
}