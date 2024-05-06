package cn.lanqiao.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.java.swing.plaf.windows.resources.windows;


/**
 * Page3-【管理页面】
  * 需实现该页面中如下 5 个方法的操作代码：
  *  
 * 1.点击【+新增】元素操作方法
 * 2.表单框输入【岗位名称】的方法
 * 3.表单框输入【岗位编码】的方法
 * 4.表单框输入【显示顺序】的方法
 * 5.点击【确定】按钮的方法
 * 
 * 注意1：不要在  Page 页的方法中填写 iframe 的切换代码。
 * 注意2：注意不要改动已经写好的方法名。
 *
 */
public class AddPostPage {

    protected WebDriver driver;

    public AddPostPage(WebDriver driver){
        this.driver = driver;
    }

    
    public void clickAddButton(){
    	//TODO 请实现点击【+新增】元素操作方法
    	WebElement addElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div[1]/div/a[1]"));
    	addElement.click();
    }
    
    
    public void inputPostName(String postName)  {
    	//TODO 请实现表单框输入【岗位名称】的方法，postName 为输入的参数
    	//弹出框内容
    	WebElement gwname = driver.findElement(By.xpath("//*[@id=\"postName\"]"));
    	gwname.sendKeys(postName);
    }
    
    
    public void inputPostCode(String postCode) {
    	//TODO 请实现表单框输入【岗位编码】的方法，postCode 为输入的参数
    	WebElement gwcode = driver.findElement(By.xpath("//*[@id=\"postCode\"]"));
    	gwcode.sendKeys(postCode);
    }
    
    
    public void inputPostSort(String postSort) {
    	//TODO 请实现表单框输入【显示顺序】的方法，postSort 为输入的参数
    	driver.findElement(By.xpath("//*[@id=\"postSort\"]")).sendKeys(postSort);
    	
    }
    
    
    public void clickOkButton() {
    	//TODO 请实现点击【确定】按钮的方法
    	driver.findElement(By.xpath("/html/body/div[4]/div[3]/a[1]")).click();
//    	/html/body/div[3]/div[3]/a[1]
//    	/html/body/div[3]/div[3]/a[1]
    	
    }

}
