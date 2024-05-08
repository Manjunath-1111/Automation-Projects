package yatra_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yatra_Register_Page 
{
	@FindBy(xpath="(//li[@class='skyplus6e-header__nav-item-inner'])[1]")
	WebElement customer_login_button;
	
//	@FindBy(xpath="")
//	WebElement ;
//	
//	@FindBy(xpath="")
//	WebElement ;
//	
//	@FindBy(xpath="")
//	WebElement ;
//	
//	@FindBy(xpath="")
//	WebElement ;
//	
//	@FindBy(xpath="")
//	WebElement ;
	
	public void customer_login_button()
	{
		customer_login_button.click();
	}
	
	public Yatra_Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
