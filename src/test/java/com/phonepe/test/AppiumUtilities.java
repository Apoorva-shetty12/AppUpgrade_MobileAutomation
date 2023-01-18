package com.phonepe.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.net.URL;

public class AppiumUtilities {
    public URL url;
    public AndroidDriver driver;

    @BeforeTest
    public void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel-1");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, "/Users/apoorvan/Desktop/decathalon_3.23.9.107.apk");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
        caps.setCapability("appPackage", "com.evamall.evacustomer");
        caps.setCapability("appActivity",
                "com.evamall.evacustomer.splash.SplashActivity");

        try { url = new URL("http://127.0.0.1:4723/wd/hub/");}
        catch(Exception e){
            System.out.println("Cause is "+e.getCause() );
            System.out.println("Message is "+e.getMessage());
            e.printStackTrace();
        }

        driver=new AndroidDriver(url, caps);

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
