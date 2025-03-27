package cn.lanqiao.elements;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(900, 800));
//		driver.manage().window().maximize();
//		driver.manage().window().setPosition(new Point(0, 0));
	}
	
	//处理文件上传
	@Test
	@Ignore
	public void test1() throws InterruptedException {
		  String url = "http://sahitest.com/demo/php/fileUpload.htm";
	        driver.get(url);
//	        WebDriver.Options options = driver.manage();
//	        // 添加登录的 cookie，从页面的登录操作中获取一个cookie
////	        options.addCookie(new Cookie("lqtoken", "34808c603c2bbc864fe4a90c76441249", "/"));
//	        driver.navigate().refresh();
//	        // 点击图片浏览
//	        driver.findElement(By.xpath("//*[@id=\"file\"]")).click();
//
//	        // 定位 input
//	        Thread.sleep(1000);
//	        // 选择一个文件
//	        driver.findElement(By.className("hidden")).sendKeys("C:\\Users\\jingnan\\selenium-java\\src\\main\\resources\\avatar.png");
//	        driver.findElement(By.xpath("/html/body/form[1]/input[3]")).click();

	        driver.findElement(By.cssSelector("#file")).sendKeys("E:\\eclipseWorkspace\\LQTest\\pic1.png");;
			Thread.sleep(100000);
	}
	
	
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
