package cn.lanqiao.elements;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertCommandTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(900, 800));
		driver.manage().window().setPosition(new Point(0, 0));
	}

	// alert操作
	@Test
	@Ignore
	public void test1() throws InterruptedException {
		// 连接网站
		String url = "file:///C:/driver/alert.html";
		driver.get(url);
		// 定位alert按钮
		WebElement alertElement = driver.findElement(By.xpath("/html/body/input[1]"));
		// 点击alert按钮
		alertElement.click();
		// 切换到到弹出框后，获取弹出框的文本信息
		System.out.println(driver.switchTo().alert().getText());
		// 点击确定
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	// Confirm 弹出框定位与操作
	@Test
	@Ignore
	public void test2() throws InterruptedException {
		// 连接网站
		String url = "file:///C:/driver/alert.html";
		driver.get(url);
		// 定位Confirm按钮
		WebElement confirmElement = driver.findElement(By.xpath("/html/body/input[2]"));
		// 点击页面中的按钮
		confirmElement.click();
		// 获取弹出框文本信息--弹出框的信息
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		// 点击弹出框的确认按钮--弹出框的按钮
		driver.switchTo().alert().accept();// 确认按钮

		// 点击页面中的按钮
		confirmElement.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();// 取消按钮

	}

	//prompt弹出框的定位与操作
	@Test
	@Ignore
	public void test3() throws InterruptedException {
		// 连接网站
		String url = "file:///C:/driver/prompt.html";
		driver.get(url);	
		  //定位prompt按钮
		 WebElement promptElement = driver.findElement(By.xpath("/html/body/form/input[1]")); 
		 WebElement textElement = driver.findElement(By.xpath("/html/body/form/input[2]"));
		  //点击按钮 
		 promptElement.click();
		Thread.sleep(1000);
		
		  //输出弹出框内容 
		  System.out.println(driver.switchTo().alert().getText()); 
		  driver.switchTo().alert().sendKeys("蓝桥云课"); //input
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  //再看本界面的输出 
		  System.out.println(textElement.getText());
		 
	}

	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
