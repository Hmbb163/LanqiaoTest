package cn.lanqiao.wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*��ʽ�ȴ�*/
public class ImplicitWaitCommand {

	public static WebDriver driver;
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(900, 800));
//		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test1() {
		driver.get("https://www.lanqiao.cn");
		//��ϰ��driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // ʹ����ʽ�ȴ�,���õȴ�ʱ��Ϊ 10s
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //�ڶ��ֱ����ʽ
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            // ��ʼʱ��
            System.out.println(System.currentTimeMillis());
            driver.findElement(By.tagName("...")).sendKeys("Selenium");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // ����ʱ��
            System.out.println(System.currentTimeMillis());
            driver.quit();
        }
	}
	
	
	@AfterClass@Ignore
	public static void endMain() throws InterruptedException {
//		Thread.sleep(3000);
		driver.quit();
	}
}
