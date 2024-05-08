package Selenium_Maven.Maven_Automation;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;

public class Test_1_Registration extends Amazon_Launch_and_Quit2 
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Excel_sheet_for_Login.excel_data();
		Amazon_Registration_page registartion=new Amazon_Registration_page(driver);
		registartion.customer_name();
		registartion.emailid();
		registartion.password();
		registartion.re_enter_password();
		registartion.Create_your_account_button();
	}

}
