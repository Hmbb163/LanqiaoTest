package test.cn.lanqiao.quickstart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlphaSeleniumTest {

    @Test
    public void testSelenium() {

        // ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // �򿪰ٶ���ҳ
        driver.get("https://www.baidu.com");
        // ��λ�ٶ���ҳ����������򣬲��������� �����ƿ�
        driver.findElement(By.id("kw")).sendKeys("�����ƿ�");
        // ��λ�ٶ���ҳ�İٶ�һ�°�ť�������
        driver.findElement(By.id("su")).click();
    }
}