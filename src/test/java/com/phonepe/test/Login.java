package com.phonepe.test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.Activity;


public class Login extends AppiumUtilities {

    @Test
    public void Test_1_logInToApp(){
        System.out.println("Application Launch");
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.installApp("/Users/apoorvan/Desktop/decathalon_3.24.0 .108.apk"); //Latest App
        Activity activity = new Activity("com.evamall.evacustomer", "com.evamall.evacustomer.splash.SplashActivity");
        driver.startActivity(activity);

    }


}
