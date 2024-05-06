package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Page1-【登录】页面，登录页中的4个方法已经写好，无需改动。
 * 
 * 1. 输入【用户名】
 * 2. 输入【密码】
 * 3. 输入固定的【验证码】
 * 4. 点击【登录】按钮
 *
 */
public class LoginPage {


    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // 输入【用户名称】的操作代码
    public void inputLoginName(String loginName){
    	
        //清空用户名输入框内容，防止脏数据
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]")).clear();
        //输入传入的userName参数
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]")).sendKeys(loginName);

    }

    // 输入【密码】的操作代码
    public void inputLoginPassword(String password){
        //清空密码输入框内容，防止脏数据
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]")).clear();
        //输入传入的password参数
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]")).sendKeys(password);

    }
 
    //输入【验证码】的操作代码
    public void inputCode(String code){
        //清空密码输入框内容，防止脏数据
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[1]/div[1]/input")).clear();
        //输入固定666验证码
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[1]/div[1]/input")).sendKeys(code);

    }

    //点击【登录】按钮的操作代码
    public void clickLoginButton() throws InterruptedException {
        //点击登录按钮
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
    }


}
