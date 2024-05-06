package com.lanqiao.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//登录页面
public class ShopLoginPage {
    WebDriver driver;

    public ShopLoginPage(WebDriver driver){
        this.driver = driver;
    }

    //输入用户名方法
    public void inputName(String name) throws InterruptedException {
        WebElement element_name = this.driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/dl[1]/dd/input"));
        element_name.clear();
        element_name.sendKeys(name);
        Thread.sleep(1000);
    }

    //输入密码的方法
    public void inputPassword(String password) throws InterruptedException {
        WebElement element_password = this.driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/dl[2]/dd/input"));
        element_password.clear();
        element_password.sendKeys(password);
        Thread.sleep(1000);
    }

    //点击登录按钮的方法
    public void clickLoginButton() throws InterruptedException {
        this.driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/dl[4]/dd/input[2]")).click();
        Thread.sleep(3000);
    }

}
