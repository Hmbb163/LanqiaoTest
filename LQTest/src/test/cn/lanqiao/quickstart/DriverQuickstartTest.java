package test.cn.lanqiao.quickstart;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class DriverQuickstartTest {

    @Test
    public void testDriver() {
    	
        // 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        
        // 初始化一个新的 Chrome driver 对象
        WebDriver driver = new FirefoxDriver();

        // 打开蓝桥云课官网首页
        driver.get("https://www.lanqiao.cn/");
    }
}