package cn.lanqiao.web;



import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



/**
 * 请按照操作步骤编写测试用例
 *
 * 用例要求：
 * 1.合理使用元素等待时间
 * 2.请调用 Page 类中的方法实现操作步骤
 * 3.合理使用 iframe 切换，iframe 切换的代码填写在此文件中
 * 4.不要改动已经写好的方法名。//
 *
 */
public class WebCaseTest {
	WebDriver driver = null;

	// 浏览器初始化
	@Before
	public void setUp() {
		//设置火狐路径，不要改动此处 driver 位置
		 System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	 
		// 允许跨域访问
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("security.fileuri.strict_origin_policy", false);
		options.addPreference("security.fileuri.origin_policy", "*");

		driver = new FirefoxDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		//填写被测站点地址
		driver.get("https://66174373c078967d2a7ef506.hz-iframe-svc.simplelab.cn/login");

	}
 
	
	// 请再此方法中续写测试用例代码
	@Test
	public void testBrowser() throws InterruptedException {
		//创建LoginPage对象，供调用该类中的方法实现【登录】的操作代码
		LoginPage loginPage = new LoginPage(driver);
		
		//点击登录账号输入框并输入账户-admin
		loginPage.inputLoginName("admin");

		//点击登录密码输入框并输入密码-LQ15Mock2@2004
		loginPage.inputLoginPassword("admin123");

		//点击验证码输入框并输入-666
		loginPage.inputCode("666");

		//点击登录按钮
		loginPage.clickLoginButton();
		
		//一般对于页面跳转类需要加等待时间
		Thread.sleep(2000);
		
	
		// 创建PostManagementPage对象
		PostManagementPage postManagementPage = new PostManagementPage(driver);
		
		
		// 创建PostManagementPage对象
		AddPostPage addPostPage = new AddPostPage(driver);
		
		// TODO 请参照题目中【用例步骤】补全以下代码，调用 3 个Page类中的方法实现。
//		第 3 步：登录成功后，在 【岗位管理】页面 PostManagementPage.java 中依次完成以下操作代码：
		assertEquals("蓝桥超管",postManagementPage.getUsernameText());
		
		postManagementPage.clickPostManagePath();
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
		postManagementPage.inputPostCodeSearch("ceo");
		Thread.sleep(700);
		postManagementPage.clickSearchButton();
		Thread.sleep(500);
		assertEquals("显示第 1 到第 1 条记录，总共 1 条记录",postManagementPage.getPageNumberText());
		Thread.sleep(1000);
		postManagementPage.clickDeleteButton();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		postManagementPage.clickOkButton();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
		Thread.sleep(1000);
		addPostPage.clickAddButton();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"layui-layer-iframe3\"]")));
		addPostPage.inputPostName("董事长");
		Thread.sleep(500);
		addPostPage.inputPostCode("ceo");
		Thread.sleep(500);
		addPostPage.inputPostSort("1");
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		addPostPage.clickOkButton();
	}
	
	
	// 浏览器退出
	@After
	public void tearDown() {
		if(driver!=null)
			driver.quit();
	}


}