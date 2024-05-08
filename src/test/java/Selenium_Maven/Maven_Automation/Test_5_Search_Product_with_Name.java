package Selenium_Maven.Maven_Automation;
import org.testng.annotations.Test;

public class Test_5_Search_Product_with_Name extends Amazon_Launch_and_Quit1
{
	@Test
	public void test4() throws InterruptedException
	{
		Amazon_Product_search_Home_page search_product=new Amazon_Product_search_Home_page(driver);
		search_product.search_field();
		search_product.search_button();
		search_product.select_item();
		
		
	}

}
