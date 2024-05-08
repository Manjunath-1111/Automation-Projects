package Selenium_Maven.Maven_Automation;
import org.testng.annotations.Test;

public class Test_8_Sorting extends Amazon_Launch_and_Quit1
{
	@Test
	public void test4() throws InterruptedException
	{	
		Amazon_Product_search_Home_page search_product=new Amazon_Product_search_Home_page(driver);
		search_product.search_field();
		search_product.search_button();
		//search_product.select_item();
		
		Amazon_Product_Sort_Home_Page product_sort=new Amazon_Product_Sort_Home_Page(driver);
		Thread.sleep(2000);
		product_sort.sort_by_Avg_Customer_Review();
		Thread.sleep(2000);
		product_sort.sort_by_featured();
		Thread.sleep(2000);
		product_sort.sort_by_Newest_Arrivals();
		Thread.sleep(2000);
		product_sort.sort_by_Price_High_to_Low();
		Thread.sleep(2000);
		product_sort.sort_by_Price_Low_to_High();
		Thread.sleep(2000);
	
		search_product.select_item();
	}

}
