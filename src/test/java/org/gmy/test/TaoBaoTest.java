package org.gmy.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chenghao on 2017/4/1.
 */
public class TaoBaoTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUP() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.taobao.com/";

    }
    @Test
    public void TestTaobao() throws InterruptedException {
        driver.get(baseUrl+"/");
        driver.findElement(By.id("q")).clear();
        driver.findElement(By.id("q")).sendKeys("巧克力");
        driver.findElement(By.xpath(".//*[@id='J_TSearchForm']/div[1]/button")).click();
        Thread.sleep(2000);
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
