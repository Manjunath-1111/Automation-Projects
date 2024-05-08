package Selenium_Maven.Maven_Automation;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;

public class Test_10_Update_Quantity_and_Remove_items_From_Cart extends Amazon_Launch_and_Quit1
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
		
		Amazon_Update_Product_Qty_and_Remove_Product_From_Cart_Page update_qty_delete_product_from_cart=new Amazon_Update_Product_Qty_and_Remove_Product_From_Cart_Page(driver);
		update_qty_delete_product_from_cart.update_product_quantity1();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.update_product_quantity2();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.update_product_quantity3();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.update_product_quantity10above();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.qty_txt_field();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.update_qty();
		Thread.sleep(2000);
		update_qty_delete_product_from_cart.delete_item();
		
	}

}
