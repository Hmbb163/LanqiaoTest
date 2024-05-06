package test.cn.lanqiao.quickstart;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class DriverQuickstartTest {

    @Test
    public void testDriver() {
    	
        // ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        
        // ��ʼ��һ���µ� Chrome driver ����
        WebDriver driver = new FirefoxDriver();

        // �������ƿι�����ҳ
        driver.get("https://www.lanqiao.cn/");
    }
}