package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page1-����¼��ҳ��
 * 
 * ʵ�ָ�ҳ�������� 3 ��Ԫ�صĲ������루����Ԫ��λ�ÿɲ�����Ŀ��ͼ��
 * 
 * 1. ���롾��¼���ơ�
 * 2. ���롾��¼���롿
 * 3. �������¼����ť
 *
 * ע��1����Ҫ�� Page ������д iframe �л��Ĵ��롣
 * ע��2����Ҫ�Ķ��Ѿ�д�õķ�������
 */
public class LoginPage1 {
	
	protected WebDriver driver;

    public LoginPage1(WebDriver driver){
        this.driver = driver;
    }

    
    public void inputLoginName(String loginName) throws InterruptedException{
    	//TODO ��ʵ�� ���롾�û����ơ��Ĳ������룬������������
    	//�ȶ�λ��Ԫ��
    	WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[1]"));
    	//���Ԫ��
    	inputElement.clear();
    	Thread.sleep(500);
    	//����Ԫ��
    	inputElement.sendKeys(loginName);
    }


    public void inputLoginPassword(String password) throws InterruptedException{
    	//TODO ��ʵ�� ���롾���롿�Ĳ������룬������������
    	//�ȶ�λ������Ԫ��
    	WebElement passElement = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/input[2]"));
    	//���Ԫ��
    	passElement.clear();
    	Thread.sleep(500);
    	//����Ԫ��
    	passElement.sendKeys(password);
    }

    
    public void clickLoginButton() throws InterruptedException {
    	//TODO ��ʵ�� �������¼����ť�Ĳ�������
    	//��λ��¼��ť
    	WebElement okElement = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
    	//���
    	okElement.click();
    }
}
