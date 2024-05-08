package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import ddt.Excel_sheet_for_Login;

public class Test_12_Cash_on_Delivery extends Amazon_Launch_and_Quit
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
		
		Amazon_Product_Filter_Home_page filter=new Amazon_Product_Filter_Home_page(driver);
		filter.pay_on_delivery();
		
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
		
		Amazon_Cash_On_Delivery_Payment_Option_Page cod=new Amazon_Cash_On_Delivery_Payment_Option_Page(driver);
		cod.cash_on_delivery_radio_button();
		Thread.sleep(2000);
		cod.use_this_payment_method_button();
		Thread.sleep(2000);
		cod.place_your_order_button();
		
		
		
		
	}

}
