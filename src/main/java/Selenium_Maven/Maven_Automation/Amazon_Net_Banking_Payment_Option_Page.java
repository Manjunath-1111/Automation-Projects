package Selenium_Maven.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Net_Banking_Payment_Option_Page 
{
	WebDriver driver;
	Select s1;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement net_banking_radio_button ;
	
	@FindBy(xpath="//select[@name='ppw-bankSelection_dropdown']")
	WebElement choose_bank_dd ;
	
	@FindBy(xpath="//div[@class='a-row continue-buttons place-order-button']")
	WebElement use_this_payment_method_button;
	
	@FindBy(xpath="//input[@value='Join Prime']")
	WebElement popup;
	
	@FindBy(xpath="//span[@id='bottomSubmitOrderButtonId']")
	WebElement place_your_order_and_pay_button;
	
	@FindBy(xpath="//input[@name='fldLoginUserId']")
	WebElement enter_user_id;
	
	@FindBy(xpath="//a[.='CONTINUE']")
	WebElement continue_button;
	
	@FindBy(name="fldPassword")
	WebElement enter_password;
	
	@FindBy(xpath="//a[@class='btn btn-primary login-btn']")
	WebElement login_button;
	
	public void net_banking_radio_button()
	{
		net_banking_radio_button.click();
	}
	public void choose_bank_dd()
	{
		s1=new Select(choose_bank_dd);
		s1.selectByVisibleText("HDFC Bank");
	}
	public void use_this_payment_method_button() throws InterruptedException
	{
		use_this_payment_method_button.click();
	}	
	
	public void popup()
	{
		popup.click();
	}
	public void place_your_order_and_pay_button()
	{
		place_your_order_and_pay_button.click();
	}
	public void enter_user_id()
	{
		enter_user_id.sendKeys("Manju1234");
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void enter_password()
	{
		enter_password.sendKeys("Manju@1234");
	}
	public void login_button()
	{
	login_button.click();
	}
	
	public Amazon_Net_Banking_Payment_Option_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
