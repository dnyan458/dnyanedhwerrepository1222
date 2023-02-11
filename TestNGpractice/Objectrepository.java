package TestNGpractice;

import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objectrepository 
{
 @FindBy(xpath="//span[@class='user-id']")
 WebElement userIdLabel;
 @FindBy(xpath="//div[@class='avtar']")
 WebElement userImage;

 @FindBy(xpath="//span[@class='nickname']")
 WebElement nickname;

 @FindBy(xpath="//input[contains(@placeholder,'search')]")
 WebElement serachMarket;

 @FindBy(xpath="//span[@class='user-id']//li/descendant::span/descendant::span[contains(text(),'NSE')/parent::'")
 WebElement searchMarketlist;

 @FindBy(xpath="//div[@class='vddl=list list flat']//div/descendant::span[text()='ONGC']")
 WebElement searchONGC;

 @FindBy(xpath="//div[@class='vddl=list list flat']//div/descendant::span[text()='SBIN']")
 WebElement searchSBIN;
 

 @FindBy(xpath="//span[@class='button-blue buy and contains(text(),'B')]")
 WebElement btnBlue;


 @FindBy(xpath="//div[@class='su-checkbox-group']//span[text()='Stoploss']//preceding-sibling::span'")
 WebElement checkbox;
 

 @FindBy(xpath="//div[@class='su-checkbox-group']//span[text()='Target']//preceding-sibling::span")
 WebElement checkbox2;



 @FindBy(xpath="//button[contains(text(),'C')]")
 WebElement btnCancel;
 @FindBy(xpath="//div[class='marktewatch-sidebar marketwatch-wrap']'C')]//ul[@class='marketwatch-selecter list-flat']/li[contains(text()'']")
 WebElement marketUL;
 
 
 public Objectrepository()
 {
	SearchContext driver;
	PageFactory.initElements(driver, this); 
 }
 public String checkidTitle()
 {
	return driver.getTitle(){
 }	
	public boolean checkUserimage()
	{
		return userImage.isDisplayed();
	}
		
	public String checkuserIdLabel()
	{
		return userIdLabel.getText();
	}
		
	public String nickname()
	{
		return nickname.getText();
	}
	public void checkMarketUl()
	{
		marketUL.click();
	}
		public void checkbtnBlue() throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(searchSBIN).build().perform();
			Thread.sleep(3000);
			btnBlue.click();
			checkbox.click();
			checkbox2.click();
			Thread.sleep(3000);
			btnCancel.click();
		}
		public void checksearchMarket() throws InterruptedException
		{
			searchMarketlist.sendKeys("Hdfc");
			Thread.sleep(3000);
		}
		{
 
   List<WebElement> list = driver.findElement(By.xpath("//span[contains(text(),'HDFC')]"));
 System.out.println("Total sujjestion are:  "+list.size());
 System.out.println();
 }
 } 
 
 
 
 
 
 
 
 
 
 
 
 
 