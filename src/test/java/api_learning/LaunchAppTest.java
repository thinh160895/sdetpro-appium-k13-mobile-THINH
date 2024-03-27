package api_learning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppTest {

  public static void main(String[] args) {
    // DesiredCaps
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("udid", "emulator-5554");
    desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
    desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

    AppiumDriver appiumDriver = null;
    // Init session
    try {
      URL appiumServer = new URL("http://localhost:4723");
      appiumDriver = new AndroidDriver(appiumServer, desiredCapabilities);
    } catch (Exception e){
      e.printStackTrace();
    }

    // Close session
    if(appiumDriver != null) {
      appiumDriver.quit();
    }
  }
}
