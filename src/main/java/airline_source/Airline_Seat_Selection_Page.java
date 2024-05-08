package airline_source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Seat_Selection_Page 
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='ddd43014']/div/label")
	List <WebElement> select_travellers;
	
	@FindBy(xpath="//button[.='Proceed to seat selection']")
	WebElement proceed_to_seat_selection;	
	
	@FindBy(xpath="//div[@class='_93930998 ']/div/div")
	List <WebElement> select_seats;
	
	@FindBy(xpath="//button[.='Next']")
	WebElement next_button;
	
	@FindBy(xpath="(//div[.='Skip seat selection'])[2]")
	WebElement skip_seat_selection_button;
	
	public void select_travellers_a1()
	{	
		select_travellers.get(0).click();
	}
	public void select_travellers_a2()
	{
		select_travellers.get(1).click();
	}
	public void select_travellers_a3()
	{
		select_travellers.get(2).click();
	}	
	public void select_travellers_a4()
	{
		select_travellers.get(3).click();
	}	
	public void select_travellers_a5()
	{
		select_travellers.get(4).click();
	}	
	public void select_travellers_a6()
	{
		select_travellers.get(5).click();
	}	
	public void select_travellers_a7()
	{
		select_travellers.get(6).click();
	}	
	public void select_travellers_a8()
	{
		select_travellers.get(7).click();
	}	
	public void select_travellers_a9()
	{
		select_travellers.get(8).click();
	}
	public void select_travellers_c1()
	{
		select_travellers.get(9).click();
	}
	public void select_travellers_c2()
	{
		select_travellers.get(10).click();
	}
	public void select_travellers_c3()
	{
		select_travellers.get(11).click();
	}
	public void select_travellers_c4()
	{
		select_travellers.get(12).click();
	}
	public void select_travellers_c5()
	{
		select_travellers.get(13).click();
	}
	public void select_travellers_c6()
	{
		select_travellers.get(14).click();
	}
	public void select_travellers_c7()
	{
		select_travellers.get(15).click();
	}
	public void select_travellers_c8()
	{
		select_travellers.get(16).click();
	}
	public void select_travellers_i1()
	{
		select_travellers.get(17).click();
	}
	public void select_travellers_i2()
	{
		select_travellers.get(18).click();
	}
	public void select_travellers_i3()
	{
		select_travellers.get(19).click();
	}
	public void select_travellers_i4()
	{
		select_travellers.get(20).click();
	}
	public void select_travellers_i5()
	{
		select_travellers.get(21).click();
	}
	public void select_travellers_i6()
	{
		select_travellers.get(22).click();
	}
	public void select_travellers_i7()
	{
		select_travellers.get(23).click();
	}
	public void select_travellers_i8()
	{
		select_travellers.get(24).click();
	}
	public void select_travellers_i9()
	{
		select_travellers.get(25).click();
	}
	
	public void proceed_to_seat_selection()
	{
		proceed_to_seat_selection.click();
	}
	
	public void select_seats1() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(56).click();
	}
	public void select_seats2() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(57).click();
	}
	public void select_seats3() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(58).click();
	}
	public void select_seats4() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(60).click();
	}
	public void select_seats5() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(61).click();
	}
	public void select_seats6() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(62).click();
	}
	public void select_seats7() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(63).click();
	}
	public void select_seats8() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(64).click();
	}
	public void select_seats9() throws InterruptedException
	{
		Thread.sleep(1000);
		select_seats.get(65).click();
	}
	
	
	public void next_button()
	{
		next_button.click();
	}
	
	public void skip_seat_selection_button()
	{
		skip_seat_selection_button.click();
	}
	
	public Airline_Seat_Selection_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
