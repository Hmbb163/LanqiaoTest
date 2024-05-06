package cn.lanqiao.cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // 定义用户名密码输入框的定位信息
    By input = By.tagName("input");
    // 定义登录按钮的定位信息
    By loginButton = By.className("ant-btn-primary");

    // 输入用户名操作
    public void enterUsername(String username){
        List<WebElement> inputs = driver.findElements(input);
        inputs.get(0).sendKeys(username);
    }

    // 输入密码操作
    public void enterPassword(String password){
        List<WebElement> inputs = driver.findElements(input);
        inputs.get(1).sendKeys(password);
    }

    // 点击登录操作
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
