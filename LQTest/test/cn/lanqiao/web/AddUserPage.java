package cn.lanqiao.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * 
 * Page3-【添加用户】页面
 * 
 * 需实现该页面中如下 5 个元素的操作代码（以下元素位置可参照题目附图）
 * 
 * 1. 输入【用户名称】
 * 2. 输入【登录账号】
 * 3. 输入【登录密码】
 * 4. 选择角色中的【普通用户】
 * 5. 点击【保存】按钮
 * 
 * 注意1：不要在 Page 类中填写 iframe 切换的代码。
 * 注意2：不要改动已经写好的方法名。
 * 
 */
public class AddUserPage {

	protected WebDriver driver;

    public AddUserPage(WebDriver driver){
        this.driver = driver;
    } 
    
    

    public void  inputUserName(String userName) throws InterruptedException{
    	//TODO 请实现 输入【用户名称】的操作代码，请先清空输入框【iframe65】
    	WebElement inUserNamElement = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    	inUserNamElement.clear();
    	Thread.sleep(500);
    	inUserNamElement.sendKeys(userName);
    }

    public void  inputLoginName(String loginName) throws InterruptedException{
    	//TODO 请实现输入【登录账号】的操作代码，请先清空输入框【iframe65】
    	WebElement inputLoginName = driver.findElement(By.xpath("//*[@id=\"loginName\"]"));
    	inputLoginName.clear();
    	Thread.sleep(500);
    	inputLoginName.sendKeys(loginName);
    }


    public void  inputLoginPassword(String loginPassword) throws InterruptedException{
    	//TODO 请实现输入【密码】的操作代码，请先清空输入框【iframe65】
    	WebElement inputLoginPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	inputLoginPassword.clear();
    	Thread.sleep(500);
    	inputLoginPassword.sendKeys(loginPassword);
    }
    

    public void  clickRole(){
    	//TODO 请实现点击【角色】--【普通用户】的操作代码【iframe65】
    	WebElement clickRoleElement = driver.findElement(By.xpath("/html/body/div[1]/form/div[6]/div/div/div/label[2]/div/ins"));
    	//点击经理按钮
//    	WebElement clickRoleElement = driver.findElement(By.xpath("/html/body/div[1]/form/div[6]/div/div/div/label[1]/div/ins"));
    	clickRoleElement.click();
    }

    public void clickSaveButton(){
    	//TODO 请实现点击【保存】按钮的操作代码
    	WebElement clickSaveButton = driver.findElement(By.xpath("/html/body/div[2]/div/button[1]"));
    	clickSaveButton.click();
    }
    

}
