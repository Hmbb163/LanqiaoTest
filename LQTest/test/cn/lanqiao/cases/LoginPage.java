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

    // �����û������������Ķ�λ��Ϣ
    By input = By.tagName("input");
    // �����¼��ť�Ķ�λ��Ϣ
    By loginButton = By.className("ant-btn-primary");

    // �����û�������
    public void enterUsername(String username){
        List<WebElement> inputs = driver.findElements(input);
        inputs.get(0).sendKeys(username);
    }

    // �����������
    public void enterPassword(String password){
        List<WebElement> inputs = driver.findElements(input);
        inputs.get(1).sendKeys(password);
    }

    // �����¼����
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
