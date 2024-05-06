package test.cn.lanqiao.quickstart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlphaSeleniumTest {

    @Test
    public void testSelenium() {

        // 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // 打开百度首页
        driver.get("https://www.baidu.com");
        // 定位百度首页的搜索输入框，并输入内容 蓝桥云课
        driver.findElement(By.id("kw")).sendKeys("蓝桥云课");
        // 定位百度首页的百度一下按钮，并点击
        driver.findElement(By.id("su")).click();
    }
}