package cn.lanqiao.wait;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*ÏÔÊ¾µÈ´ý*/
public class ExplicitWaitCommand {

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

        try {
            System.out.println(System.currentTimeMillis());
            WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(1))
            		.until(driver1 -> driver1.findElement(By.id("kkk")));
//            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(3)).until(driver1 -> driver1.findElement(By.id("123")));
//            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(3)).until(driver1 -> driver1.findElement(By.id("123")));
            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println(System.currentTimeMillis());
            driver.quit();
        }
	}
	
	
	@AfterClass
	@Ignore
	public static void endMain() throws InterruptedException {
//		Thread.sleep(3000);
		driver.quit();
	}
}
