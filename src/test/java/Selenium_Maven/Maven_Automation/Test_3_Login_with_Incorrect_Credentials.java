package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;
public class Test_3_Login_with_Incorrect_Credentials extends Amazon_Launch_and_Quit
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Excel_sheet_for_Login.excel_data();
		
		Amazon_SignIn_Page sign_in=new Amazon_SignIn_Page(driver);
		sign_in.wrong_email_id();
		sign_in.continue_button();
		sign_in.wrong_pass();
		String title1=driver.getTitle();
		System.out.println(title1);
		sign_in.submit();
		String title2=driver.getTitle();
		System.out.println(title2);
		
		Assert.assertNotEquals(title1, title2);	
	}
}
