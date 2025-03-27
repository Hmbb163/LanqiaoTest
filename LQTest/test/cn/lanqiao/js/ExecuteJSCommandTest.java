package cn.lanqiao.js;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecuteJSCommandTest {

	public static WebDriver driver;
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(900, 500));
//		driver.manage().window().setPosition(new Point(0, 0));
//		driver.manage().window().maximize();
        driver.get("https://www.lanqiao.cn");

	}
	
	//用js执行代码
	@Test
	@Ignore
	public void test1() {
        // 将 driver 转换为 JavascriptExecutor 用来执行 js 代码
        JavascriptExecutor js = (JavascriptExecutor) driver;//universal-header-search-input
        String jsCode = "document.getElementsByClassName(\"universal-header-search-input\")[0].value=\"Selenium\"";
        // 执行 js 代码/html/body/div/div/div/div[2]/div/div/div/div/div[1]/div/div[7]/input
        js.executeScript(jsCode);
	}
	
	//滑动到底部
	@Test
	@Ignore
	public void test2() {
        // 将 driver 转换为 JavascriptExecutor 用来执行 js 代码
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		JavascriptExecutor jsoExecutor = (JavascriptExecutor) driver;
		
		// 让窗口滚动条向下滑动完整的窗口高度，即到滑动到底部
		String jscodeString = "window.scrollTo(0,document.body.scrollHeight);";
		js.executeScript(jscodeString);
//		js.executeScript("window.scroolTo(100,document.body.scroolHeight)");
		
	}
	
	//滑动相对高度
	@Test
	@Ignore
	public void test3() throws InterruptedException {
		//将driver赋值给Js
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//设置相对高度
			//向下滑动500像素
		String jscodeString = "window.scrollBy(0,500)";
		jsExecutor.executeScript(jscodeString);
		Thread.sleep(1000);
			//向右滑动500像素
		String jscodeString2 = "window.scrollBy(500,0)";
		jsExecutor.executeScript(jscodeString2);
		
	}
	
	//一直滑动来找元素
	@Test
	@Ignore
	public void test4() {
		driver.get("https://jqueryui.com/selectable/");
		  //driver-->js 
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  //setwebelement 
		  // WebElement webElement =driver.findElement(By.className("meta-title")); 
//		  String jscode ="document.getElementById(\"components-paths\").scrollIntoView(true)" ;
		  String jscode="document.getElementsByTagName(\"iframe\")[0]";
		  String jsCodeString=".document.getElementsByClassName(\\\"ui-widget-content ui-selectee\\\")[0].scroolIntoView(true)";
		  //不适用--只适用:element.scrollInToView 
		  // String jscode ="document.getElementsByClassName(\"contest-card__title\").scrollIntoView(true)"; 
		  js.executeScript(jscode);
		  js.executeScript(jsCodeString);
	        
	}
	
	
	@Test@Ignore
	public void t() throws InterruptedException {
		WebElement webElement = driver.findElement(By.id("components-paths"));
		webElement.click();
		Thread.sleep(1000);
	}
	
	//获取域名
	@Test
	@Ignore
	public void testGetDomain() {
		//将driver转化为js
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//将执行结果的域名返回成字符串
		String dominString = (String) js.executeScript("return document.domain");
		System.out.println(dominString);//www.lanqiao.cn
		System.out.println(driver.getCurrentUrl());//https://www.lanqiao.cn/
		
	}
	
	//改变字体的颜色属性
    @Test
    @Ignore
    public void testChangeColor() throws Exception{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // 滑动到右边
        js.executeScript("window.scrollBy(500, 0);");
        // 会改会员按钮中会员字体的颜色为红色
        js.executeScript("document.getElementsByClassName(\"menu-item-link\")[0].style=\"color:red\"");
    }

    //验证页面是否有滑动条
    @Test
    @Ignore
    public void testHasScroll() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	String jscodeString = "return document.body.scrollHeight>(window.innerHeight || document.documentElement.clientHeight)";
    	Boolean boolean1 = (Boolean) js.executeScript(jscodeString);
    	System.out.println(boolean1);
    	
    }
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
