package org.gmy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by chenghao on 2017/4/1.
 */
public class LoginPage {
    private static WebElement element; //???

    public static WebElement Login_Icon(WebDriver driver) {
        element = driver.findElement(By.id("J_Quick2Static"));
        return element;
    }
    public static WebElement login_Username(WebDriver driver) {
        element = driver.findElement(By.id("TPL_username_1"));
        return element;
    }
    public static WebElement login_Password(WebDriver driver) {
        element = driver.findElement(By.id("TPL_password_1"));
        return element;
    }
    public static WebElement login_Button(WebDriver driver) {
        element = driver.findElement(By.id("J_SubmitStatic"));
        return element;
    }


}
