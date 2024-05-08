package airline_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Number_of_passanger_selection_page 
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='_4e0ac60f _75ad9cd5 ad23ce76']/div/button")
	List<WebElement> select_adults;
	
	public void select_adults1() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(0).click();
	}
	public void select_adults2() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(1).click();
	}
	public void select_adults3() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(2).click();
	}
	public void select_adults4() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(3).click();
	}
	public void select_adults5() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(4).click();
	}
	public void select_adults6() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(5).click();
	}
	public void select_adults7() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(6).click();
	}
	public void select_adults8() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(7).click();
	}
	public void select_adults9() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(8).click();
	}
	public void select_child0() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(9).click();
	}
	public void select_child1() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(10).click();
	}
	public void select_child2() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(11).click();
	}
	public void select_child3() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(12).click();
	}
	public void select_child4() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(13).click();
	}
	public void select_child5() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(14).click();
	}
	public void select_child6() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(15).click();
	}
	public void select_child7() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(16).click();
	}
	public void select_child8() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(17).click();
	}
	public void select_child9() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(18).click();
	}
	public void select_infant0() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(19).click();
	}
	public void select_infant1() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(20).click();
	}
	public void select_infant2() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(21).click();
	}
	public void select_infant3() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(22).click();
	}
	public void select_infant4() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(23).click();
	}
	public void select_infant5() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(24).click();
	}
	public void select_infant6() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(25).click();
	}
	public void select_infant7() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(26).click();
	}
	public void select_infant8() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(27).click();
	}
	public void select_infant9() throws InterruptedException
	{
		Thread.sleep(1000);
		select_adults.get(28).click();
	}
	
	public Airline_Number_of_passanger_selection_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
