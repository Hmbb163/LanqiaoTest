package cn.lanqiao.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class ScreenCommand {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.lanqiao.cn/");
	}
	
	//获取元素截屏并保存到本地
	@Test@Ignore
	public void elementShot() throws IOException {
		
		WebElement webElement = driver.findElement(By.tagName("input"));
		webElement.sendKeys("selenium");
		 // 获取元素截屏
			//获取元素的截图，并输出保存为文件形式
		File eleShot = webElement.getScreenshotAs(OutputType.FILE);
			//将一个已经存在的文件（eleShot），复制到一个新的文件（在这里是./input.png）。 
		FileUtils.copyFile(eleShot,new File("./input.png"));
//		File eleFile = webElement.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(eleFile, new File("./input.png"));
//        System.out.println(eleShot.getName());
	}
	
	
	//获取整个屏幕的截屏
	@Test
	public void testScreenShot() throws IOException {
		//写法：driver.getScreenshotAs(output.file); + f2 回车
		File eleFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File sFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sFile, new File("./screen.png"));
		FileUtils.copyFile(eleFile, new File("./screen.png"));
	}
	
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
