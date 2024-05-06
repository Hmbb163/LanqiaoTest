package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page1-【登录】页面
 * 
 * 实现该页面中如下 3 个元素的操作代码（以下元素位置可参照题目附图）
 * 
 * 1. 输入【登录名称】
 * 2. 输入【登录密码】
 * 3. 点击【登录】按钮
 *
 * 注意1：不要在 Page 类中填写 iframe 切换的代码。
 * 注意2：不要改动已经写好的方法名。
 */
public class LoginPage1 {
	
	protected WebDriver driver;

    public LoginPage1(WebDriver driver){
        this.driver = driver;
    }

    
    public void inputLoginName(String loginName) throws InterruptedException{
    	//TODO 请实现 输入【用户名称】的操作代码，请先清空输入框
    	//先定位到元素
    	WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]"));
    	//清空元素
    	inputElement.clear();
    	Thread.sleep(500);
    	//输入元素
    	inputElement.sendKeys(loginName);
    }


    public void inputLoginPassword(String password) throws InterruptedException{
    	//TODO 请实现 输入【密码】的操作代码，请先清空输入框
    	//先定位到密码元素
    	WebElement passElement = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]"));
    	//清空元素
    	passElement.clear();
    	Thread.sleep(500);
    	//输入元素
    	passElement.sendKeys(password);
    }

    
    public void clickLoginButton() throws InterruptedException {
    	//TODO 请实现 点击【登录】按钮的操作代码
    	//定位登录按钮
    	WebElement okElement = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
    	//点击
    	okElement.click();
    }
}
