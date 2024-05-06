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
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://mail.163.com/";

	        driver.get(url);
//		--���ҵ���ҳԪ��tagName�е�iframe�������xPath��
	        WebElement iFrame = driver.findElement(By.tagName("iframe"));
//	    --�ٶ�λ��iframe���ڵ�IFrame����----driver�����ҵ�iframe�ڲ�������·��
	        driver.switchTo().frame(iFrame);
	        Thread.sleep(3000);
//	        ��ʱ��ſ���ֱ�Ӷ�λ��email
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("18222222");

	        Thread.sleep(1000);
	        driver.quit();
	    }
}
