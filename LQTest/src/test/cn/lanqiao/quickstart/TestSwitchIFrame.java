package test.cn.lanqiao.quickstart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSwitchIFrame {

	   @Test
	    public void testSwitchIframe() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://mail.163.com/";

	        driver.get(url);
//		--先找到网页元素tagName中的iframe【最好用xPath】
	        WebElement iFrame = driver.findElement(By.tagName("iframe"));
//	    --再定位到iframe所在的IFrame部件----driver有了找到iframe内部部件的路径
	        driver.switchTo().frame(iFrame);
	        Thread.sleep(3000);
//	        这时候才可以直接定位到email
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("18222222");

	        Thread.sleep(1000);
	        driver.quit();
	    }
}
