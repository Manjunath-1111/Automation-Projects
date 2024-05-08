package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;

public class Test_12_netbanking extends Amazon_Launch_and_Quit
{
	@Test
	public void test4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Excel_sheet_for_Login.excel_data();
		Amazon_SignIn_Page sign_in=new Amazon_SignIn_Page(driver);
		sign_in.email_id();
		sign_in.continue_button();
		sign_in.pass();
		sign_in.submit();
		
		Amazon_Product_search_Home_page search_product=new Amazon_Product_search_Home_page(driver);
		search_product.search_field();
		search_product.search_button();
		search_product.select_item();
		
		Set<String> pc1=driver.getWindowHandles();
		Iterator<String> pc=pc1.iterator();
		String p=pc.next();
		System.out.println(p);
		String c=pc.next();
		driver.switchTo().window(c);
		
		Amazon_Add_to_cart_Product_Page add_to_cart=new Amazon_Add_to_cart_Product_Page(driver);
		add_to_cart.add_to_cart();
		
		Amazon_Proceed_to_Buy_Product_Page proceed_to_buy=new Amazon_Proceed_to_Buy_Product_Page(driver);
		proceed_to_buy.proceed_to_buy_after_adding_cart();
		
		Amazon_Select_Address_Page select_address=new Amazon_Select_Address_Page(driver);
		select_address.change_address_link();
		select_address.select_address();
		Thread.sleep(2000);
		select_address.use_this_address_button();
		
		Amazon_Net_Banking_Payment_Option_Page net_bank_details=new Amazon_Net_Banking_Payment_Option_Page(driver);
		net_bank_details.net_banking_radio_button();
		net_bank_details.choose_bank_dd();
		Thread.sleep(2000);
		net_bank_details.use_this_payment_method_button();
		Thread.sleep(2000);
		net_bank_details.popup();
		
		Thread.sleep(2000);
		net_bank_details.place_your_order_and_pay_button();
		
//		WebElement iframe=driver.findElement(By.name("bottom_frame"));
//		driver.switchTo().frame(iframe);
		
		net_bank_details.enter_user_id();
		net_bank_details.continue_button();
		net_bank_details.enter_password();
		net_bank_details.login_button();
		
		
		
	}

}
