package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet_for_Login 

{
	public static String un1;
	public static String pwd1;
	public static String un2;
	public static String pwd2;
	public static String un3;
	public static String pwd3;
	public static void excel_data() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\malag\\eclipse-workspace\\Selenium_programs\\Excel_Sheet\\manjunath.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		un1=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		pwd1=w1.getSheet("login1").getRow(1).getCell(0).getStringCellValue();
		un2=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		pwd2=w1.getSheet("login1").getRow(2).getCell(0).getStringCellValue();
		un3=w1.getSheet("login").getRow(3).getCell(0).getStringCellValue();
		pwd3=w1.getSheet("login1").getRow(3).getCell(0).getStringCellValue();
	}

}
