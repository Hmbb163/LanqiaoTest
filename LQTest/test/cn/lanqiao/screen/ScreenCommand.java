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
	
	//��ȡԪ�ؽ��������浽����
	@Test@Ignore
	public void elementShot() throws IOException {
		
		WebElement webElement = driver.findElement(By.tagName("input"));
		webElement.sendKeys("selenium");
		 // ��ȡԪ�ؽ���
			//��ȡԪ�صĽ�ͼ�����������Ϊ�ļ���ʽ
		File eleShot = webElement.getScreenshotAs(OutputType.FILE);
			//��һ���Ѿ����ڵ��ļ���eleShot�������Ƶ�һ���µ��ļ�����������./input.png���� 
		FileUtils.copyFile(eleShot,new File("./input.png"));
//		File eleFile = webElement.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(eleFile, new File("./input.png"));
//        System.out.println(eleShot.getName());
	}
	
	
	//��ȡ������Ļ�Ľ���
	@Test
	public void testScreenShot() throws IOException {
		//д����driver.getScreenshotAs(output.file); + f2 �س�
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
