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

/*隐式等待*/
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
		//练习：driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 使用隐式等待,设置等待时间为 10s
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //第二种表达形式
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            // 开始时间
            System.out.println(System.currentTimeMillis());
            driver.findElement(By.tagName("...")).sendKeys("Selenium");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // 结束时间
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
