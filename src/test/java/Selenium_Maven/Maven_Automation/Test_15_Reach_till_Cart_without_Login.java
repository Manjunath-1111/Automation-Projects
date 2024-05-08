package Selenium_Maven.Maven_Automation;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test_15_Reach_till_Cart_without_Login extends Amazon_Launch_and_Quit1
{
	@Test
	public void test4() throws InterruptedException, EncryptedDocumentException, IOException
	{
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
		

		
		
		
	}

}
