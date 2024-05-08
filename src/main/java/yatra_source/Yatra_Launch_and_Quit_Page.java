package yatra_source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Yatra_Launch_and_Quit_Page 
{
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}

}
