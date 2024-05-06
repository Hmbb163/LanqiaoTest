package cn.lanqiao.elements;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocatorsTest {

//	--使用 findElement 和 findElements 来定位百度首页的元素--
	 @Test
	 @Ignore
	    public void testFindElement() throws Exception {
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 定位到搜索输入框
	        WebElement element = driver.findElement(By.id("kw"));
	        // 输入 selenium 关键字
	        element.sendKeys("selenium");
	        
	        // 获取页面中 input 框的列表--百度页面的input框
	        List<WebElement> elementList = driver.findElements(By.tagName("input"));
	        System.out.println(driver.getTitle());
	        
	        // 输出列表中input框的个数
	        System.out.println(elementList.size());

	        Thread.sleep(500);
	        driver.quit();
	    }
	 
//	 通过id关键字查找
	 @Test@Ignore
	    public void testFindElementById() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过 id 定位到搜索输入框
	        WebElement element = driver.findElement(By.id("kw"));
	        // 在搜索输入框中输入 selenium 关键字
	        element.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 --通过Name值定位--
	 @Test@Ignore
	    public void testFindElementByName() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();

	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过 name 属性定位到 搜索输入框
	        WebElement element = driver.findElement(By.name("wd"));
	        // 在搜索输入框中输入 name 关键字
	        element.sendKeys("name");

	        Thread.sleep(1000);
//	        driver.quit();
	    }
	 
//	 通过文字定位
	 @Test@Ignore
	    public void testFindElementByLinkTextAndPartialLinkText() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 定位到新闻标签-------------------------------------
	        WebElement newsEle = driver.findElement(By.linkText("新闻"));
	        // 点击新闻标签
	        newsEle.click();
	        // 休眠3s
	        Thread.sleep(3000);
	        // 再次打开 百度首页-------------------------------------
	        driver.get(url);
	        // 定位首页的 hao123　标签－－－－－－－－－－－－－－－－－－－－－－－
	        WebElement haoEle = driver.findElement(By.partialLinkText("hao"));
	        // 点击 hao123 标签
	        haoEle.click();

	        // 休眠 3s
	        Thread.sleep(3000);
	        driver.quit();
	    }
	 
//	 通过class定位
	 @Test@Ignore
	    public void testFindElementByClassName() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过 className 定位到搜索输入框
	        WebElement sIpt = driver.findElement(By.className("s_ipt"));
	        // 输入 selenium 关键字
	        sIpt.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 通过tag_name来定位----------------------------------不会！！！！！！！！！！！！！！！！！！！！！！
	 @Test@Ignore
	    public void testFindElementByTagName() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 定位百度首页的 input 列表，通过 tagName 定位
	        List<WebElement> inputList = driver.findElements(By.tagName("input"));
	        // 选择 input 列表中的索引为7也就是第8个元素，也就是页面的输入框
	        WebElement searchInput = inputList.get(7);
	        // 给输入框中输入关键字
	        searchInput.sendKeys("selenium");
	        
	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 使用xPath来定位
	 @Test@Ignore
	    public void testFindElementByAbsXpath() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过 chrom 检查工具获取到的 xpath 表达式来定位 input 输入框
//	        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[1]/input"));
	        WebElement input = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
	        // input 输入框中输入关键字
	        input.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 通过元素索引定位
	 @Test@Ignore
	    public void testFindElementByXpathIndex() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过索引表达式来定位搜索输入框
	        WebElement input = driver.findElement(By.xpath("//span/input[1]"));
	        input.sendKeys("selenium");
	    
	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 通过css定位
	 @Test
	 @Ignore
	    public void testFindByCssSelector() throws Exception{
		// 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // 初始化 Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // 通过搜索输入框的 css selector 表达式定位
	        WebElement input = driver.findElement(By.cssSelector("#kw"));
	        input.sendKeys("selenium");
	        
	        Thread.sleep(1000);
	        driver.quit();

	    }
}