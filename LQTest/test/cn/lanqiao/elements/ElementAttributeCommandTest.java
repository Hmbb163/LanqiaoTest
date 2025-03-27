package cn.lanqiao.elements;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAttributeCommandTest {

//	--获取元素属性
	@Test@Ignore
	public void testGetEleAttr() throws InterruptedException {
//		设置webDriver的路径
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String url = "http://www.lanqiao.cn/";
		driver.get(url);
		Thread.sleep(1000);
		
//		定位登录按钮
		WebElement sigin = driver.findElement(By.linkText("登录"));
		// 输出登录按钮的-文本信息-，即 div 标签中间的内容
		System.out.println(sigin.getText());
        // 输出登录按钮的-标签名-
		System.out.println(sigin.getTagName());
        // 输出登录按钮的 -class 属性的属性值-
		System.out.println(sigin.getAttribute("href"));
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	
//	--验证Is xxx 方法 是否正确
	 @Test
//	 @Ignore
	    public void testIs() throws Exception{
	        // 设置 WebDriver 的路径
		 System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");	      
		 WebDriver driver = new FirefoxDriver();
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);

	        Thread.sleep(1000);
	        // 定位到蓝桥云课首页的搜索输入框-------------------------
	        WebElement input = driver.findElement(By.className("universal-header-search-input"));
	        // input元素是否可操作-----------------isEnabled用于是否可以单击等操作
	        System.out.println(input.isEnabled());
	        // input元素是否在页面展示----------------isDisplayed用于在界面是否展示
	        System.out.println(input.isDisplayed());
	        // input元素是否被选中---------isSelected用于单选框或多选框中【false--不是单选框或多选框】
	        System.out.println(input.isSelected());

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 

}
