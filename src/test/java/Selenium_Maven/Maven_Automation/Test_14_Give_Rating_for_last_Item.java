package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;

public class Test_14_Give_Rating_for_last_Item extends Amazon_Launch_and_Quit
{
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Excel_sheet_for_Login.excel_data();
		
		Amazon_SignIn_Page2 sign_in=new Amazon_SignIn_Page2(driver);
		sign_in.email_id();
		sign_in.continue_button();
		sign_in.pass();
		sign_in.submit();
		sign_in.enter_captcha();
		Thread.sleep(10000);
		sign_in.continue_shopping_button();
		sign_in.enter_otp();
		Thread.sleep(15000);
		sign_in.sign_in_button();
		
		Amazon_ratings_Returns_and_Orders_Page rate_the_product=new Amazon_ratings_Returns_and_Orders_Page(driver);
		rate_the_product.returns_and_orders_link();
		rate_the_product.Write_a_product_review_link();
		rate_the_product.rating_button();
		rate_the_product.write_review();
//		rate_the_product.submit_button();
	}

}
