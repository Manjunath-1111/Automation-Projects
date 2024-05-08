package Selenium_Maven.Maven_Automation;
import org.testng.annotations.Test;

public class Test_6_Apply_Filters extends Amazon_Launch_and_Quit1
{
	@Test
	public void test4() throws InterruptedException
	{	
		Amazon_Product_search_Home_page search_product=new Amazon_Product_search_Home_page(driver);
		search_product.search_field();
		search_product.search_button();
		//search_product.select_item();
		
		Amazon_Product_Filter_Home_page product_filter=new Amazon_Product_Filter_Home_page(driver);
		Thread.sleep(2000);
		product_filter.ratings();
		Thread.sleep(2000);
		product_filter.price_range();
		Thread.sleep(2000);
		product_filter.discount();
		Thread.sleep(2000);
		product_filter.new_arraivals();
		Thread.sleep(2000);
		product_filter.delivery_day_options();
		Thread.sleep(2000);
		product_filter.pay_on_delivery();
		
		
		search_product.select_item();
	}

}
