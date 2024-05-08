package cleartrip_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cleartrip_source.Cleartrip_Login_or_SignUp_Page;

public class Test_1 
{
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Cleartrip_Login_or_SignUp_Page signup=new Cleartrip_Login_or_SignUp_Page(driver);
		
		//signup.login_or_signup_button();
		Thread.sleep(2000);
		signup.enter_mobile_number_text_field();
		signup.otp1();
		signup.otp2();
		signup.otp3();
		Thread.sleep(10000);
		//signup.email_id();
		signup.my_account();
		signup.select_profile();
		
	}

}
