package cn.lanqiao.cases;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCasesTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://passport.lanqiao.cn/login");
	}
	
	//基本操作：自动输入账号，密码，点击登录，获取页面标题
	@Test@Ignore
	public void testLogin() throws InterruptedException {
		//定位到第一个输入框
		List<WebElement> inputs = driver.findElements(By.className("ant-input"));
		// 第一个输入框，就是用户名输入框，输入登录用户名
        inputs.get(0).sendKeys("17851935085");
        // 第二个输入框，就是密码输入框，输入密码
        inputs.get(1).sendKeys("djxyxb06010508...");
        // 定位到登录按钮，并点击登录
        driver.findElement(By.className("ant-btn-primary")).click();

        // 休眠 2000ms
        Thread.sleep(1000);

        // 获取页面标题
        String title = driver.getTitle();

        // 断言页面标题是否为 用户信息
        Assert.assertEquals("用户信息", title);
	}
	
	@Test@Ignore
	public void testLogin1() throws InterruptedException {
		//初始化页面对象
		LoginPage loginPage = new LoginPage(driver);
		UserInfoPage userInfoPage = new UserInfoPage(driver);
		//登录
		loginPage.enterUsername("17851935085");
		loginPage.enterPassword("djxyxb06010508...");
		loginPage.clickLoginButton();
		//等待2s
		Thread.sleep(2000);
		//判断
		Assert.assertEquals("用户信息", userInfoPage.getPageTitle());
	}
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
