package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.java.swing.plaf.windows.resources.windows;

import javafx.scene.control.Alert;

/**
 * Page2-【岗位管理页面】
  * 需实现该页面中如下 7 个方法的操作代码（以下元素位置可参照题目附图）：
  *  
 * 1.获取登录后的【蓝桥超管】文本值
 * 2.点击【系统管理】 > 点击【岗位管理】 的菜单路径
 * 3.定位搜索项中的【岗位编码】输入框 ，并输入参数post_code
 * 4.点击【搜索】按钮方法
 * 5.获取搜索结果的【分页显示信息文本值】
 * 6.点击搜索列表【删除】按钮
 * 7.点击【确认】删除的按钮
 * 
 *  注意1：不要在Page页的方法中填写 iframe 的切换代码
 *  注意2：注意不要改动已经写好的方法名。
 *
 */
public class PostManagementPage{
    protected WebDriver driver;

    public PostManagementPage(WebDriver driver){
        this.driver = driver;
    }
    
   
	public String getUsernameText() {
		//通过classname找到【蓝桥超管】
		WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/ul/li[3]/a/span"));
		return webElement.getText();
		 //TODO 请实现 获取【蓝桥超管】的操作方法，注意在此方法中添加返回值
	        
	}
    
    public void clickPostManagePath() throws InterruptedException{
    	//TODO 请依次实现点击【系统管理】 > 点击【岗位管理】 的路径操作方法
    	WebElement webElement = driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/a"));
    	webElement.click();
    	
    	//记得有一定的休眠时间
    	  Thread.sleep(1000);
    	WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div[1]/ul/li[3]/ul/li[5]/a"));
    	webElement2.click();
    	//
    	Thread.sleep(1000);
    }
    

    
    public void inputPostCodeSearch(String postCode) {
    	//TODO 请实现搜索条件【岗位编码】输入框的方法，post_code 为输入参数
        WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[1]/input"));
        webElement.sendKeys(postCode);
    }
    
    
    public void clickSearchButton() {
    	//TODO 请实现点击【搜索】按钮的方法
    	//-弹窗操作-
//    	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div[3]/iframe[2]")));
       WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[4]/a[1]"));
       webElement.click();
    }
    
    public String getPageNumberText() throws InterruptedException {
		//TODO 请实现 获取【分页显示信息文本值】的操作方法，注意在此方法中添加返回值
    	WebElement pageinfoElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/div[1]/span"));
    	return pageinfoElement.getText();
	}
   
   public void clickDeleteButton() {
   	   //TODO 请实现点击【删除】按钮的方法
	 //-弹窗操作-
//   	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[8]/a[2]"));
       webElement.click();
   }

//-错误！！！！！！-
   public void clickOkButton() {
   	   //TODO 请实现点击【确认】删除按钮的方法
	   driver.findElement(By.linkText("确认")).click();
	  
   }
}
