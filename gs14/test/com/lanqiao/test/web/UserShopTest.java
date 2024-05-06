package com.lanqiao.test.web;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

//简单的用户购物流程类
public class UserShopTest {

    static WebDriver driver = null;

    @Before
    public void setUp() {
        //TODO 请填写chromedriver.exe的路径
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options = new ChromeOptions();
        //取消沙盒模式，以最高权限运行，解决有的windows系统有时候无法启动chrome，控制台显示500的error
        //options.addArguments("--no-sandbox");
        //使用 chrome浏览器打开以下页面
        driver = new ChromeDriver(options);
        //设置隐式等待
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        
        //TODO 请填写被测站点地址
        driver.get("");

    }

    @After
    public void tearDown() {
        //TODO 请填写浏览器退出
    }

    @Test
    public void testShop() throws InterruptedException {
        //TODO 请填写测试用例
    }
}
