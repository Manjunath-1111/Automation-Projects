package cleartrip_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cleartrip_Login_or_SignUp_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Enter mobile number']")
	WebElement enter_mobile_number_text_field ;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement  otp1;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement otp2 ;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement otp3  ;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement otp4  ;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email_id  ;
	
	@FindBy(xpath="(//div[@class='fs-2 c-inherit flex flex-nowrap'])[1]")
	WebElement my_account;
	
	@FindBy(xpath="//div[@class='col-12']/div/li")
	List <WebElement> select_profile ;

	public void enter_mobile_number_text_field()
	{
		enter_mobile_number_text_field.click();
		enter_mobile_number_text_field.sendKeys("7676825148");
	}
	public void otp1()
	{
		otp1.sendKeys("1");
	}
	public void otp2()
	{
		otp2.sendKeys("1");
	}
	public void otp3()
	{
		otp3.sendKeys("1");
	}
	public void otp4()
	{
		otp4.sendKeys("1");
	}
	public void my_account()
	{
		my_account.click();
	}
	public void select_profile()
	{
		select_profile.get(6).click();
	}
	public void email_id()
	{
		email_id.sendKeys("manjunathmetagudd1111@gmail.com");
	}
	
	public Cleartrip_Login_or_SignUp_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
