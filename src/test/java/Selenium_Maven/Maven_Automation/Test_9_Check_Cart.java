package Selenium_Maven.Maven_Automation;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
public class Test_9_Check_Cart extends Amazon_Launch_and_Quit1
{
	@Test
	public void test4() throws InterruptedException
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
		add_to_cart.view_cart();
		
		
	}

}
