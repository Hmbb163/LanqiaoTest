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
	
	//cookie��֤��¼
	@Test
	public void test1() throws InterruptedException {
		//ֱ����ַ
		String urlString = "https://www.lanqiao.cn";
		driver.get(urlString);
		
		 WebDriver.Options options = driver.manage();
	        // ��ȡ Cookie �ļ���
	        Set<Cookie> cookieSet = options.getCookies();
	        //����Set<Cookie> cookieSet = driver.manage().getCookies();Ҳ��ok��
	        // ��� ���е� Cookie �� Name �� Value
	        for (Cookie cookie : cookieSet) {
	            System.out.println(cookie.getName() + ": " + cookie.getValue());
	        }
	        Thread.sleep(2000);

	        // ɾ�����е� cookie
	        options.deleteAllCookies();
	        Thread.sleep(2000);
	        // ��ҳ����ִ�е�¼��������ȡһ����Ч��cookie
	        // Cookie �Ĺ��췽��Ҫ����һ�� Cookie �����ƣ�Cookie �� Value �Լ����÷�Χ��
	        // / ��ʾ�ڵ�ǰ�����µ�����·������Ч
	        Cookie loginCookie = new Cookie("lqtoken", "34808c603c2bbc864fe4a90c76441249", "/");
	        // �� cookie ��ӵ� options ��
	        options.addCookie(loginCookie);
	        // ˢ��ҳ�棬��ʱ�ѱ�ɵ�¼״̬
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
