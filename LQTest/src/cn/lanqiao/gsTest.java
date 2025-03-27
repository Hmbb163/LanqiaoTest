package cn.lanqiao;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class gsTest {

	WebDriver driver = null;
	
	//初始化
	@Before
	public void setup() {
		//设置火狐驱动
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		//设置等待时长5s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//设置窗口大小
		driver.manage().window().setSize(new Dimension(1500, 500));
				
		//填写被测网站地址
		String urlString = "https://6655c0fd14120c2639839b6d.hz-iframe-svc.simplelab.cn/login";
		driver.get(urlString);
	}
	
	@Test
	public void test() throws InterruptedException {
		//进入网站，检测网站标题是否为“登录蓝桥系统”
		Assert.assertEquals("登录蓝桥系统", driver.getTitle());
		//清除脏数据--输入账户，密码，验证码
			//账户
		WebElement username = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/input[1]"));
		username.clear();
		username.sendKeys("admin");
		Thread.sleep(500);
		
			//密码
		WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/input[2]"));
		password.clear();
		password.sendKeys("admin123");
		Thread.sleep(500);
		
			//验证码
		WebElement certifycode = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[1]/div[1]/input"));
		certifycode.clear();
		certifycode.sendKeys("666");
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		Thread.sleep(1000);
		
		
		//进入页面，进行账号验证
		Assert.assertEquals("蓝桥超管", driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/ul/li[3]/a/span")).getText());;
		
		//点击系统管理--部门管理
		driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/ul/li[4]/a")).click();
		
		//查找“哈哈哈”并删除
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")))
		.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[1]/input")).sendKeys("哈");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr/td[6]/a[3]")).click();
		
		//点击重置，滑动滚动条，找到“123”并删除
		
		WebElement delete = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr[12]/td[6]/a[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",delete);
		//获取123的文本
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr[14]/td[2]")).getText());
		delete.click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]")).getText());
		driver.findElement(By.className("layui-layer-btn0")).click();
		//??????????????????????????????????????????????????????????????????????????????????????????????????????
		
		//退出frame模式--点击全屏
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"fullScreen\"]")).click();
		
		
	}
	
	@After
	public void end() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
