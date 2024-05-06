package cn.lanqiao.elements;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(900, 800));
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0, 0));
	}
	
	//�����ļ��ϴ�
	@Test
	public void test1() throws InterruptedException {
		  String url = "http://sahitest.com/demo/php/fileUpload.htm";
	        driver.get(url);
	        WebDriver.Options options = driver.manage();
	        // ��ӵ�¼�� cookie����ҳ��ĵ�¼�����л�ȡһ��cookie
//	        options.addCookie(new Cookie("lqtoken", "34808c603c2bbc864fe4a90c76441249", "/"));
	        driver.navigate().refresh();
	        // ���ͼƬ���
	        driver.findElement(By.xpath("//*[@id=\"file\"]")).click();

	        // ��λ input
	        Thread.sleep(1000);
	        // ѡ��һ���ļ�
	        driver.findElement(By.className("hidden")).sendKeys("C:\\Users\\jingnan\\selenium-java\\src\\main\\resources\\avatar.png");
	        driver.findElement(By.xpath("/html/body/form[1]/input[3]")).click();

	}
	
	
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
