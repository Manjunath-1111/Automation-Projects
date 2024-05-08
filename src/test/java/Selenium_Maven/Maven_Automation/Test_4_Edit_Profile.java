package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;

public class Test_4_Edit_Profile extends Amazon_Launch_and_Quit
{
	@Test
	public void test4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amazon_SignIn_Page sign_in=new Amazon_SignIn_Page(driver);
		Excel_sheet_for_Login.excel_data();
		sign_in.email_id();
		sign_in.continue_button();
		sign_in.pass();
		sign_in.submit();

		WebElement ho1=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(ho1).perform();
		
		Amazon_Edit_Profile_Page edit_pfofile=new Amazon_Edit_Profile_Page(driver);
		edit_pfofile.Your_Account();
		edit_pfofile.Edit_Profile();
//		edit_pfofile.password();
		edit_pfofile.otp();
		Thread.sleep(20000);
		edit_pfofile.submit_otp_button();
		edit_pfofile.edit_name_button();
		edit_pfofile.edit_customer_Name();
		edit_pfofile.save_changes_button();
	}

}
