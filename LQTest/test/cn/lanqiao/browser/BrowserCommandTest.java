package cn.lanqiao.browser;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class BrowserCommandTest {

   //打开浏览器
    @Test@Ignore
    public void testOpenBrowser() throws Exception{
        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // 初始化 Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";
        // 调用 driver 的 get 方法打开 蓝桥云课官网
        driver.get(url);
    }
    
    //获取当前页面的标题
    @Test@Ignore
    public void testGetPageTitle() throws Exception{

        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // 初始化 Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";
        // 通过 title 变量接收 driver 的 getTitle 方法返回的值，即浏览器的 Title
        driver.get(url);
        String title = driver.getTitle();
        // 在控制台输出 title
        System.out.println(title);
    }
    
    //获取当前页面的 URL 地址
    @Test@Ignore
    public void testGetPageUrl() throws Exception {
        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// 初始化 Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";
        // 通过 currentUrl 变量来接收 driver 的 getCurrentUrl 方法返回的值
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        // 输出 currentUrl 变量的内容
        System.out.println(currentUrl);
    }
    
 
    //关闭浏览器
    @Test@Ignore
    public void testCloseBrowser() throws Exception{
        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// 初始化 Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";

        try {
            // 打开浏览器进入蓝桥云课官网
            driver.get(url);
            // 等待或者休眠 3000ms = 3s
            Thread.sleep(3000);
            // 关闭当前浏览器窗口
            driver.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    //退出浏览器
    @Test@Ignore
    public void testQuitBrowser() throws Exception{
        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// 初始化 Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";

        try {
            // 打开蓝桥云课官网
            driver.get(url);
            // 休眠 3000ms
            Thread.sleep(3000);
            // 退出当前浏览器进程
            driver.quit();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //浏览器页面切换操作
    @Test
    public void testSwitchHandle() throws Exception{
        // 设置 WebDriver 的路径
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        // 进入百度首页
        driver.get("https://www.baidu.com/");
        System.out.println("baidu handle："+driver.getWindowHandle());
        
      // 输出当前页面的标题
        System.out.println("1. "+driver.getTitle());//“百度一下，你就知道”       
        // 搜索框中输入 蓝桥云课
        driver.findElement(By.id("kw")).sendKeys("蓝桥云课");
        // 搜索蓝桥云课
        driver.findElement(By.id("su")).click();
        Thread.sleep(1000);
        // 点击第一个蓝桥云课官网
        driver.findElement(By.partialLinkText("蓝桥云课")).click();  
      // 输出当前页面的标题
        System.out.println("2. "+driver.getTitle());//“蓝桥云课_百度搜索”
        // 获取当前窗口的句柄getWindowHandle
        String baiduWindow = driver.getWindowHandle();//“百度”的句柄
        
     // 输出当前页面的标题
        System.out.println("什么handle？"+driver.getWindowHandle());//“蓝桥云课_百度搜索”
        
        // 定义变量保存蓝桥云课官网页面的句柄
        String lanqiaoWindow = null;
        //Set<String> windowHandles 是名为windowHandles的字符串集合[不可重复]
        //getWindowHandles用于获取所有打开的窗口或标签页的句柄
        Set<String> windowHandles = driver.getWindowHandles();
     // 输出当前页面的标题
        System.out.println("4. 重点！！！--》"+driver.getTitle());
        
        // 循环所有的句柄
        for (String windowHandle : windowHandles) {
            // 如果当前句柄不是第一个百度窗口--“蓝桥云课_百度搜索”的句柄
            if (!windowHandle.equalsIgnoreCase(baiduWindow)){
                // 就将这个窗口句柄赋值给 lanqiaoWindow
                lanqiaoWindow = windowHandle;
                // 切换到 lanqiaoWindow
                driver.switchTo().window(lanqiaoWindow);
            }
        }
        System.out.println("baidu handle:"+baiduWindow);
        System.out.println("lq handle:"+lanqiaoWindow);
        //由于上面切换到lqwindow了：driver.switchTo().window(lanqiaoWindow);
        //所以现在的句柄是lq的
        System.out.println("什么handle？"+driver.getWindowHandle());
        Thread.sleep(1000);

        // 输出蓝桥云课页面的标题
        
        System.out.println("5. 重点！！！--》"+driver.getTitle());
        driver.quit();
    }
    
}