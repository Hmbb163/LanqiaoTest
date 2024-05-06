package cn.lanqiao.browser;




import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowCommandTest {

//	
	 @Test
	public void testWindow() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);
	        
	        // 获取窗口的大小
	        System.out.println("默认窗口大小为："+driver.manage().window().getSize());

	        // 获取窗口的位置
	        
	        System.out.println("默认窗口位置：" + driver.manage().window().getPosition());
	        
	        Thread.sleep(3000);
	        // 窗口最大化
	        driver.manage().window().maximize();

	        // 再次获取窗口的大小
	        System.out.println("设置最大化后窗口的大小为："+driver.manage().window().getSize());

	        Thread.sleep(3000);
	        // 全屏
	        driver.manage().window().fullscreen();

	        Thread.sleep(3000);
	        // 设置窗口为指定大小
	        driver.manage().window().setSize(new Dimension(400, 200));
	        System.out.println("窗口指定大小为：" + driver.manage().window().getSize());

	        Thread.sleep(3000);
	        // 设置窗口位置
	        driver.manage().window().setPosition(new Point(80, 100));
	   
	        
	        // 获取窗口的位置
	        System.out.println("设置后的窗口位置：" + driver.manage().window().getPosition());
	        driver.quit();
	    }
	 
}
