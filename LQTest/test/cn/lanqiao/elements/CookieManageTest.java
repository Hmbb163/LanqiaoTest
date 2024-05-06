package cn.lanqiao.elements;

import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieManageTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(900, 800));
		driver.manage().window().maximize();
//		driver.manage().window().setPosition(new Point(0, 0));
	}
	
	//cookie验证登录
	@Test
	public void test1() throws InterruptedException {
		//直达网址
		String urlString = "https://www.lanqiao.cn";
		driver.get(urlString);
		
		 WebDriver.Options options = driver.manage();
	        // 获取 Cookie 的集合
	        Set<Cookie> cookieSet = options.getCookies();
	        //或者Set<Cookie> cookieSet = driver.manage().getCookies();也是ok的
	        // 输出 所有的 Cookie 的 Name 和 Value
	        for (Cookie cookie : cookieSet) {
	            System.out.println(cookie.getName() + ": " + cookie.getValue());
	        }
	        Thread.sleep(2000);

	        // 删除所有的 cookie
	        options.deleteAllCookies();
	        Thread.sleep(2000);
	        // 在页面上执行登录操作，获取一个有效的cookie
	        // Cookie 的构造方法要输入一个 Cookie 的名称，Cookie 的 Value 以及作用范围，
	        // / 表示在当前域名下的所有路径都生效
	        Cookie loginCookie = new Cookie("lqtoken", "34808c603c2bbc864fe4a90c76441249", "/");
	        // 将 cookie 添加到 options 中
	        options.addCookie(loginCookie);
	        // 刷新页面，此时已变成登录状态
	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        System.out.println(loginCookie.getName()+" : "+loginCookie.getValue());
	}
	
	
	
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
