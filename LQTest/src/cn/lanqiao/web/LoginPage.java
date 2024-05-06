package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Page1-����¼��ҳ�棬��¼ҳ�е�4�������Ѿ�д�ã�����Ķ���
 * 
 * 1. ���롾�û�����
 * 2. ���롾���롿
 * 3. ����̶��ġ���֤�롿
 * 4. �������¼����ť
 *
 */
public class LoginPage {


    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // ���롾�û����ơ��Ĳ�������
    public void inputLoginName(String loginName){
    	
        //����û�����������ݣ���ֹ������
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]")).clear();
        //���봫���userName����
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]")).sendKeys(loginName);

    }

    // ���롾���롿�Ĳ�������
    public void inputLoginPassword(String password){
        //���������������ݣ���ֹ������
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]")).clear();
        //���봫���password����
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]")).sendKeys(password);

    }
 
    //���롾��֤�롿�Ĳ�������
    public void inputCode(String code){
        //���������������ݣ���ֹ������
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[1]/div[1]/input")).clear();
        //����̶�666��֤��
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[1]/div[1]/input")).sendKeys(code);

    }

    //�������¼����ť�Ĳ�������
    public void clickLoginButton() throws InterruptedException {
        //�����¼��ť
        driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
        Thread.sleep(2000);
    }


}
