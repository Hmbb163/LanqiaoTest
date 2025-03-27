package cn.lanqiao.elements;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementCommendsTest {

//	设置全局变量
	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		// 设置 WebDriver 的路径
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
         driver = new FirefoxDriver();
         driver.manage().window().setSize(new Dimension(900, 800));
         driver.manage().window().setPosition(new Point(0, 0));
	}
	
//	 Click操作
	 @Test@Ignore
	    public void testClick() throws Exception{
	        
	        String url = "https://www.lanqiao.cn/";

	        driver.get(url);

	        // 根据 partialLinkText 获取讨论区超链接元素
	        WebElement discussLinkEle = driver.findElement(By.partialLinkText("讨论"));
	        
	        // 点击讨论区-----------------
	        discussLinkEle.click();

	        Thread.sleep(3000);
	        // 最大化窗口，让登录按钮出现在窗口中
	        driver.manage().window().maximize();

	        // 根据 linkText 获取登录按钮
	        WebElement loginBtnEle = driver.findElement(By.linkText("登录"));
	        // 点击登录按钮
	        loginBtnEle.click();

	        Thread.sleep(1000);
	    }
	 
//	 sendkeys 和 clear 操作
	 @Test@Ignore
	    public void testSendKeysAndClear() throws Exception{
		 
		 	//打开测试网站
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);
	        
	        //定位 input 输入框
	        WebElement input = driver.findElement(By.tagName("input"));
	        
	        // 输入 Selenium----------------------------------
	        input.sendKeys("Selenium");
	        Thread.sleep(3000);
	        
	        // 清空输入框-------------------------------------
	        input.clear();
	        Thread.sleep(1000);
	    }

	 
//	 submit 提交------只适用于from下，所以有局限性
	 @Test
	 @Ignore
	    public void testSubmit() throws Exception{
		 
	        String url = "https://www.baidu.com/";
	        driver.get(url);

	        // 定位蓝桥云课首页的input输入框
	        WebElement input = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
	        // 输入 Selenium 字符串
	        input.sendKeys("Selenium");
	        Thread.sleep(1000);
	        // 提交
	        	//法一:	
	        input.submit();
	        	//法二:
	        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();;
	        
	        Thread.sleep(1000);
	    }
	 
	 
//	 select选择单选框
	 @Test
//	 @Ignore
	    public void testSelectEle() throws Exception{
	        // 设置 WebDriver 的路径
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        String url = "http://sahitest.com/demo/selectTest.htm";

	        driver.get(url);

	        // 定位到单选框
	        WebElement selectEle = driver.findElement(By.id("s1Id"));//xp://*[@id="s1Id"]
	        // 创建 Select 类
	        Select select = new Select(selectEle);

	        // 获取该单选框的所有的选项
//这样也可以：List<WebElement>opElements = new Select(selectEle).getOptions();
	        List<WebElement> options = select.getOptions();
	        // 输出第一个选项的文本内容
	        System.out.println("get0: "+options.get(0).getText());

	        // 获取已被选择的选项信息
	        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	        // 获取第一个被选择的选项的文本信息
	        System.out.println("allselected: "+allSelectedOptions.get(0).getText());
	        // 输出第一个选项是否被选中
	        System.out.println("是否被选中:" + allSelectedOptions.get(0).isSelected());
	        
	        // 根据索引选择：0开始
	        select.selectByIndex(2);
	        Thread.sleep(1000);
	        // 根据 value 属性值选择
//	        select.selectByValue("two");
	        Thread.sleep(1000);
	        // 根据页面显示的文本内容选择
//	        select.selectByVisibleText("Four");

	        Thread.sleep(1000);
	    }
	 
	 
//	 select单选框操作
	 @Test
	 @Ignore
	    public void test1() throws Exception{
		 
	        String path = "http://sahitest.com/demo/selectTest.htm";

	        driver.get(path);

	        Thread.sleep(1000);
	        //定位到第一个单选框
			WebElement Select1Element=driver.findElement(By.id("s1Id"));
//			将WebElement对象转换成Slect对象
			Select select1=new Select(Select1Element);
//			通过下标选择内容 选择下标为1的
			select1.selectByIndex(1);
			
//			获取所可选的选项
			List<WebElement> optionList=select1.getOptions();
//			放进去的其实是一个WebElement对象
			System.out.println("(下标为1的)选项是"+optionList.get(1).getText());
			System.out.println("(下标为1的)是否被选中?="+optionList.get(1).isSelected());
			Thread.sleep(500);
			//下标选择为2的
			select1.selectByIndex(2);
			System.out.println("(2)text:"+optionList.get(2).getText());
			System.out.println("(2)tagn:"+optionList.get(2).getTagName());
			System.out.println("(2)is selected?--"+ optionList.get(2).isSelected());
			
			Thread.sleep(500);
			//定位到到第二个单选框
			WebElement Select2Element=driver.findElement(By.id("s2Id"));
//			将WebElement对象转换成Slect对象
			Select select2=new Select(Select2Element);

			Thread.sleep(500);
//			选择文本内容
			select2.selectByVisibleText("o2");
//			获取所有可选的选项
			List<WebElement> optionList2 = select2.getOptions();
			System.out.println("第二个单选框:选择的是02？--" + optionList2.get(2).getText());
			System.out.println("第二个单选框:02selected？--" + optionList2.get(2).isSelected());
			//选择索引下标
			select2.selectByIndex(1);
			System.out.println("第二个单选框选择的是o1？--" + optionList2.get(1).getText());
			System.out.println("第二个单选框，(1)is selected？--" + optionList2.get(1).isSelected());
			
			/*
			 * Thread.sleep(500); //定位到的第三个单选框 WebElement Select3Element =
			 * driver.findElement(By.id("s3Id")); // 将WebElement对象转换成Slect对象 Select
			 * select3=new Select(Select3Element); List<WebElement> optionList3 =
			 * select3.getOptions(); Thread.sleep(1000); // 选择
			 * select3.selectByValue("o2val"); System.out.println("第3个单选框，(2)selected？--" +
			 * optionList3.get(2).isSelected()); Thread.sleep(1000);
			 * 
			 * select3.selectByVisibleText("o1"); System.out.println("第3个单选框，(1)selected？--"
			 * + optionList3.get(1).isSelected()); Thread.sleep(1000);
			 * 
			 * select3.selectByValue("o3val"); System.out.println("第3个单选框，(3)selected？--" +
			 * optionList3.get(3).isSelected()); Thread.sleep(1000);
			 * 
			 * System.out.println("window size:" + driver.manage().window().getSize() );
			 * System.out.println("window size:" + driver.manage().window().getPosition() );
			 */
			
	    }
	 
//	 select多选框操作
	 @Test
//	 @Ignore
	 public void test2() throws InterruptedException {
		 //连接网址
		 String url = "http://sahitest.com/demo/selectTest.htm";
		 driver.get(url);
		 
		 //选择第四个多选框
		 WebElement webElement = driver.findElement(By.id("s4Id"));
		 //将webelement部件 转化为 select部件
		 Select select = new Select(webElement);
		 //将select部件存入到List表中
//		 List<WebElement> options = select.getOptions();
		 //进行选择选项
		 select.selectByIndex(1);
		 select.selectByIndex(2);
		 
		 List<WebElement> optionsSelected = select.getAllSelectedOptions();
		 int i = optionsSelected.size();
		 Thread.sleep(500);
		 System.out.println("first:"+select.getFirstSelectedOption().getText());
		 //循环遍历已选择的选项
		 if(i>0) {
			 System.out.println("\"AllSelected:\"");
			 for(i=i-1;i>=0;i--) {
				 System.out.println(optionsSelected.get(i).getText());
				 
				 Thread.sleep(500);
			 }
		 }
		 
		 Thread.sleep(2000);
		 select.deselectAll();
//		 List<WebElement> optionsSelected1 = select.getAllSelectedOptions();
//		 System.out.println("outputAllSelected:" + optionsSelected1.get(1).getText());
		 
//		 System.out.println(options.get(1).getText() +"   "+ options.get(2).getText());
		 
	 }

	 
	 @AfterClass
	 public static void endMain() {
		 driver.quit(); 
	 }
}
