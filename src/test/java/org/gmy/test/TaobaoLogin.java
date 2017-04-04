package org.gmy.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chenghao on 2017/4/1.
 */
public class TaobaoLogin {
    private static WebDriver driver;   //？？?

    public static void login(WebDriver driver,String Login_Username,String Login_Password){//???
        LoginPage.Login_Icon(driver).click();
        LoginPage.login_Username(driver).sendKeys(Login_Username);//（（driver）???不是element?）
        LoginPage.login_Password(driver).sendKeys(Login_Password);
        LoginPage.login_Button(driver).click();

    }

    public static void main(String args[]) {
        driver = new FirefoxDriver(); //???
        driver.get("https://login.taobao.com/member/login.jhtml?spm=a21bo.50862.754894437.1.JBH6yb&f=top&redirectURL=https%3A%2F%2Fwww.taobao.com%2F");
        login(driver,"果果loveshopping","haozi2012!");
    }
}
