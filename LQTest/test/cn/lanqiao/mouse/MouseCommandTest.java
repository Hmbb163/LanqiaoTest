package cn.lanqiao.mouse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


public class MouseCommandTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}
	
	//悬停操作
	@Test@Ignore
	public void testMoveToElement() {
		driver.get("https://www.lanqiao.cn");
		//创建动作坑
		Actions actions = new Actions(driver);
		//创建元素坑
		WebElement coursElement = driver.findElement(By.partialLinkText("蓝桥杯"));
		//moveToElement:将鼠标指针移动到指定的网页元素上，而perform方法则执行这个动作
		actions.moveToElement(coursElement).perform();	
	}
	
	//拖拽操作
	@Test@Ignore
	public void testDragElement() {
		driver.get("https://jqueryui.com/droppable/");
		//创建动作坑
		Actions actionsAction = new Actions(driver);
		//转化为iFrame--找到iFrame的组件--在组件里面进行拖拽
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//创建元素坑
		 WebElement srcElement = driver.findElement(By.id("draggable"));
		 WebElement destElement = driver.findElement(By.id("droppable"));
		 
		//执行动作:点击保持--拖动--松手
		 actionsAction.dragAndDrop(srcElement, destElement).perform();
//		actionsAction.clickAndHold(srcElement).moveToElement(destElement).release().perform();
	}
	
	//将元素拖到指定位置
	@Test@Ignore
	public void testDrageElementToPostion() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		//Actions
		Actions actions = new Actions(driver);
		//iFrame--必须先iFrame再Webelement
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Webelement
		WebElement srcElement = driver.findElement(By.id("draggable"));
		
		
		 // 往右拖拽 100
        actions.dragAndDropBy(srcElement, 100, 0).perform();
        Thread.sleep(2000);

        // 往下拖拽 100
        actions.dragAndDropBy(srcElement, 0, 100).perform();
        Thread.sleep(2000);
	}
	
	//鼠标放大或者缩小元素
	@Test
	public void moveByOffsetmoveByOffset() throws InterruptedException {
		driver.get("https://jqueryui.com/resizable/");
		//Actions
		Actions actions = new Actions(driver);
		//iFrame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Webelement
		// /html/body/div/div[3]---是右下角的小尖尖
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]"));
		Thread.sleep(1000);
		//act
		actions.clickAndHold(element).moveByOffset(20, 20).perform();
		Thread.sleep(1000);
		actions.clickAndHold(element).moveByOffset(-20, -20).perform();
	}
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
