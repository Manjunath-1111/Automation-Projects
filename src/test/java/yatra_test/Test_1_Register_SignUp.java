package yatra_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_1_Register_SignUp 
{
	
	WebDriver driver;
	@Test
	public void test1()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement login=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		
		driver.findElement(By.id("SignUpBtn")).click();
		
		
		//IndiGo_Register_Page login1=new IndiGo_Register_Page(driver);

		
	}
}
