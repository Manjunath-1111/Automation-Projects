package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;
public class Test_2_Login_With_Correct_Credentials extends Amazon_Launch_and_Quit
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Amazon_SignIn_Page sign_in=new Amazon_SignIn_Page(driver);
		Excel_sheet_for_Login.excel_data();
		sign_in.email_id();
		sign_in.continue_button();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		sign_in.pass();
		
		Thread.sleep(2000);
		Screen_Shot ss=new Screen_Shot(driver);
		
		sign_in.submit();
		
		Thread.sleep(2000);
		Screen_Shot ss1=new Screen_Shot(driver);
		
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		Assert.assertNotEquals(url1, url2);
		
		
	}

}
