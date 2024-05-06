package cn.lanqiao.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * 
 * Page3-������û���ҳ��
 * 
 * ��ʵ�ָ�ҳ�������� 5 ��Ԫ�صĲ������루����Ԫ��λ�ÿɲ�����Ŀ��ͼ��
 * 
 * 1. ���롾�û����ơ�
 * 2. ���롾��¼�˺š�
 * 3. ���롾��¼���롿
 * 4. ѡ���ɫ�еġ���ͨ�û���
 * 5. ��������桿��ť
 * 
 * ע��1����Ҫ�� Page ������д iframe �л��Ĵ��롣
 * ע��2����Ҫ�Ķ��Ѿ�д�õķ�������
 * 
 */
public class AddUserPage {

	protected WebDriver driver;

    public AddUserPage(WebDriver driver){
        this.driver = driver;
    } 
    
    

    public void  inputUserName(String userName) throws InterruptedException{
    	//TODO ��ʵ�� ���롾�û����ơ��Ĳ������룬������������iframe65��
    	WebElement inUserNamElement = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    	inUserNamElement.clear();
    	Thread.sleep(500);
    	inUserNamElement.sendKeys(userName);
    }

    public void  inputLoginName(String loginName) throws InterruptedException{
    	//TODO ��ʵ�����롾��¼�˺š��Ĳ������룬������������iframe65��
    	WebElement inputLoginName = driver.findElement(By.xpath("//*[@id=\"loginName\"]"));
    	inputLoginName.clear();
    	Thread.sleep(500);
    	inputLoginName.sendKeys(loginName);
    }


    public void  inputLoginPassword(String loginPassword) throws InterruptedException{
    	//TODO ��ʵ�����롾���롿�Ĳ������룬������������iframe65��
    	WebElement inputLoginPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	inputLoginPassword.clear();
    	Thread.sleep(500);
    	inputLoginPassword.sendKeys(loginPassword);
    }
    

    public void  clickRole(){
    	//TODO ��ʵ�ֵ������ɫ��--����ͨ�û����Ĳ������롾iframe65��
    	WebElement clickRoleElement = driver.findElement(By.xpath("/html/body/div[1]/form/div[6]/div/div/div/label[2]/div/ins"));
    	//�������ť
//    	WebElement clickRoleElement = driver.findElement(By.xpath("/html/body/div[1]/form/div[6]/div/div/div/label[1]/div/ins"));
    	clickRoleElement.click();
    }

    public void clickSaveButton(){
    	//TODO ��ʵ�ֵ�������桿��ť�Ĳ�������
    	WebElement clickSaveButton = driver.findElement(By.xpath("/html/body/div[2]/div/button[1]"));
    	clickSaveButton.click();
    }
    

}
