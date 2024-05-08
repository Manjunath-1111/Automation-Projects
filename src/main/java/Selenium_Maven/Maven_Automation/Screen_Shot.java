package Selenium_Maven.Maven_Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot 
{	
	
	Object name;
	String name1;
	public Screen_Shot(WebDriver driver) throws IOException
	{
	TakesScreenshot screenshot= (TakesScreenshot) driver;
	double i=Math.random();
	
	name=driver.getClass();
	name1=driver.getTitle();
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\malag\\OneDrive\\Pictures\\Screenshots"+name+" "+name1+" "+i+".png");
	FileHandler.copy(source, destination);
	
	}
}
