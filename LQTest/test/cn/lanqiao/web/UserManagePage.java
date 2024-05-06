package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * page2-���û����� ��ҳ��
 * 
 * ʵ�ָ�ҳ�������� 10 ��Ԫ�صĲ������루����Ԫ��λ�ÿɲ�����Ŀ��ͼ��
 * 
 * 
 * 1. �����ϵͳ�����˵�
 * 2. ������û������˵�
 * 3. ���������+����ť
 * 4. ���롾��¼���ơ�������
 * 5. �������������ť
 * 6. ��������á���ť
 * 7. �����ɾ������ť
 * 8. ��ȡ����ҳ��ʾ��Ϣ���ı�
 * 9. ��ȡ����¼�ɹ�����û������ı�
 * 10. ������û��˳���
 * 
 * ע��1����Ҫ�� Page ������д iframe �л��Ĵ��롣
 * ע��2����Ҫ�Ķ��Ѿ�д�õķ�������
 *
 */
public class UserManagePage {

	protected WebDriver driver;
    
    public UserManagePage(WebDriver driver){
        this.driver = driver;
    }


    public void clickSystemMenu() {
    	//TODO ��ʵ�� �����ϵͳ�����˵��Ĳ���������default��
    	//��λ--���
    	WebElement systemElement = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a"));
    	systemElement.click();
    }
    
    
    public void clickUserMenu() {
    	//TODO ��ʵ�� ������û������˵��Ĳ���������default��
    	//��λ--���
    	WebElement userElement = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
    	userElement.click();
    }


    
    public void clickAddUserButton()  {
    	//TODO ��ʵ��  ���������+����ť�Ĳ���������iframe2��	
    	WebElement adduserElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/a[1]"));
    	adduserElement.click();
    }
    

    public void inputLoginName(String loginName){
    	//TODO ��ʵ��  ���������롾��¼���ơ��Ĳ�������	��ע����������iframe2��
    	//��λ--���--����
    	WebElement inloginNamElement = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[1]/input"));
    	inloginNamElement.clear();
    	inloginNamElement.sendKeys(loginName);
    }
    

    public void clickSearchButton() {
    	//TODO ��ʵ�� �������������ť�Ĳ���������iframe2��
    	//��λ--���
    	WebElement search = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[5]/a[1]"));
    	search.click();
    }
    
    
    public void clickResetButton()  {
    	//TODO ��ʵ�� �����á���ť�Ĳ���������iframe2��
    	//��λ--���
    	WebElement resetElement = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[5]/a[2]"));
    	resetElement.click();
    }
    

    public void clickdeleteUser()  {
    	//TODO ��ʵ�� ��ɾ���� �û��Ĳ���������iframe2��
    	//��λ--���
    	WebElement resetElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[9]/a[2]"));
    	resetElement.click();
    }
    
    
    public String getUsernameText() {
    	//TODO ��ʵ�� ��ȡ����¼�ɹ���� �û����ı����Ĳ�������
    	WebElement getUserNamElement = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a/span"));
    	String nameString = getUserNamElement.getText();
    	return nameString;
    }
    
  
    public String getPageNumberText() {
    	//TODO ��ʵ�� ��ȡ����ҳ��ʾ��Ϣ���Ĳ����������˷������з���ֵ��iframe2��
    	//��λ--��ȡ
    	WebElement getpagElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/span"));
    	String massageString = getpagElement.getText();
    	return massageString;
    }
    
    
    public void clickLoginOut() {
        //TODO ��ʵ�� ���û��˳����Ĳ���������default��
    	WebElement clickoutElement = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/ul/li[6]/a"));
    	clickoutElement.click();
    }
}
