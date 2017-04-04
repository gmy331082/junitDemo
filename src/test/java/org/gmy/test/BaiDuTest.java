package org.gmy.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by chenghao on 2017/4/1.
 */
public class BaiDuTest {
    private WebDriver driver;
    private  String baseUrl;
    //private  StringBuffer errors = new StringBuffer();

    @Before
    public  void setUP(){
        driver = new FirefoxDriver();
        baseUrl = "http://www.baidu.com";

    }

    @Test
    public void testCase() {
        driver.get(baseUrl+"/");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("巧克力");
        driver.findElement(By.id("su")).click();

    }
   // @After
  //  public void tearDown() {
  //      driver.quit();
 //   }


}

