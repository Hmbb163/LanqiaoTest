package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * page2-【用户管理 】页面
 * 
 * 实现该页面中如下 10 个元素的操作代码（以下元素位置可参照题目附图）
 * 
 * 
 * 1. 点击【系统管理】菜单
 * 2. 点击【用户管理】菜单
 * 3. 点击【新增+】按钮
 * 4. 输入【登录名称】搜索框
 * 5. 点击【搜索】按钮
 * 6. 点击【重置】按钮
 * 7. 点击【删除】按钮
 * 8. 获取【分页显示信息】文本
 * 9. 获取【登录成功后的用户名】文本
 * 10. 点击【用户退出】
 * 
 * 注意1：不要在 Page 类中填写 iframe 切换的代码。
 * 注意2：不要改动已经写好的方法名。
 *
 */
public class UserManagePage {

	protected WebDriver driver;
    
    public UserManagePage(WebDriver driver){
        this.driver = driver;
    }


    public void clickSystemMenu() {
    	//TODO 请实现 点击【系统管理】菜单的操作方法【default】
    	//定位--点击
    	WebElement systemElement = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a"));
    	systemElement.click();
    }
    
    
    public void clickUserMenu() {
    	//TODO 请实现 点击【用户管理】菜单的操作方法【default】
    	//定位--点击
    	WebElement userElement = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
    	userElement.click();
    }


    
    public void clickAddUserButton()  {
    	//TODO 请实现  点击【新增+】按钮的操作方法【iframe2】	
    	WebElement adduserElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/a[1]"));
    	adduserElement.click();
    }
    

    public void inputLoginName(String loginName){
    	//TODO 请实现  搜索框输入【登录名称】的操作方法	，注意清空输入框【iframe2】
    	//定位--清空--输入
    	WebElement inloginNamElement = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[1]/input"));
    	inloginNamElement.clear();
    	inloginNamElement.sendKeys(loginName);
    }
    

    public void clickSearchButton() {
    	//TODO 请实现 点击【搜索】按钮的操作方法【iframe2】
    	//定位--点击
    	WebElement search = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[5]/a[1]"));
    	search.click();
    }
    
    
    public void clickResetButton()  {
    	//TODO 请实现 【重置】按钮的操作方法【iframe2】
    	//定位--点击
    	WebElement resetElement = driver.findElement(By.xpath("//*[@id=\"user-form\"]/div/ul/li[5]/a[2]"));
    	resetElement.click();
    }
    

    public void clickdeleteUser()  {
    	//TODO 请实现 【删除】 用户的操作方法【iframe2】
    	//定位--点击
    	WebElement resetElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[9]/a[2]"));
    	resetElement.click();
    }
    
    
    public String getUsernameText() {
    	//TODO 请实现 获取【登录成功后的 用户名文本】的操作方法
    	WebElement getUserNamElement = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a/span"));
    	String nameString = getUserNamElement.getText();
    	return nameString;
    }
    
  
    public String getPageNumberText() {
    	//TODO 请实现 获取【分页显示信息】的操作方法，此方法中有返回值【iframe2】
    	//定位--获取
    	WebElement getpagElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/span"));
    	String massageString = getpagElement.getText();
    	return massageString;
    }
    
    
    public void clickLoginOut() {
        //TODO 请实现 【用户退出】的操作方法【default】
    	WebElement clickoutElement = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/ul/li[6]/a"));
    	clickoutElement.click();
    }
}
