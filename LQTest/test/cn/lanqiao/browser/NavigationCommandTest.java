package cn.lanqiao.browser;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommandTest {

//	--进入网页--
    @Test@Ignore
    public void testNavigateTo() throws Exception {
        // 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // 初始化 Chrome Driver
        WebDriver driver = new FirefoxDriver();

        // 定义 URL 变量
        String url = "https://www.lanqiao.cn/";

        // 进入到指定的页面中
        driver.navigate().to(url);
    }
    
//    --前进+回退操作--
    @Test
    public void testNavigateBackOrForward() throws Exception{
        // 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // 初始化 Chrome Driver
        WebDriver driver = new FirefoxDriver();
        
        // 定义两个 url 地址变量
        String url1 = "https://www.baidu.com/";
        String url2 = "https://www.lanqiao.cn/";

        // 进入到百度首页------------------
        driver.get(url1);
        // 暂停2000ms
        Thread.sleep(1000);
        // 在进入到蓝桥云课官网----------------
        driver.navigate().to(url2);
        // 暂停 2000ms
        Thread.sleep(1000);
        // 后退到百度首页-----------------------
        driver.navigate().back();
        // 暂停 2000ms
        Thread.sleep(1000);
        // 在进入到蓝桥云课官网---------------------
        driver.navigate().forward();
        driver.navigate().refresh();//刷新
        Thread.sleep(1000);
        driver.quit();
    }
    
//    --刷新--
    @Test@Ignore
    public void testNavigateRefresh() throws Exception{
    	// 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // 初始化 Chrome Driver
        WebDriver driver = new FirefoxDriver();

        // 定义一个 url 变量
        String url = "https://www.lanqiao.cn/";

        // 打开百度首页
        driver.get(url);
        // 休眠 3000ms
        Thread.sleep(3000);
        // 刷新页面
        driver.navigate().refresh();
    }
}