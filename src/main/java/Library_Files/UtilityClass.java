package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{


	//Automation TE:@Mayuri
	//Date:15/02/2023
	//Day:Wed
	//Title: Fetch data from property file
	
	@Test                          //EM      //PSW
	public static String getDatafromPF(String key) throws IOException 
	{
		
		//To reach upto property File
		FileInputStream file=new  FileInputStream("C:\\Users\\mayur\\eclipse-workspace\\Insurance_Domain\\PropFile.properties");
		
		//create object of propertites class
		Properties prop=new Properties();
		
		//To open Property File
		prop.load(file);
		
		//To fetch data from Property file
		    String Value1=prop.getProperty(key);  //EM    //saradeg41@gmail.com
		                                         // PSW   //Sai@1117
	       	return Value1;  //saradeg41@gmail.com     //Sai@1117

	}
	
	//Automation TE:@Mayuri
	//Date:17/02/2023
	//Day:Friday
	//Title: Fetch data from Excelsheet
	
	@Test                                        //3           //0
	public static String getdataFromExcelsheet(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		  FileInputStream file=new  FileInputStream("C:\\Users\\mayur\\eclipse-workspace\\Insurance_Domain\\TestData\\1 Oct Morning.xlsx");  
		  
		  Sheet  Sh=WorkbookFactory.create(file).getSheet("Sheet4");
		                         //3                 //0
		  String  Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();   //Insurance Broker System
		
		return Value2; //Insurance Broker System
		
	}	
	
	@Test                                                        //101
	public static void CaptureScreenshot(WebDriver driver, int TestCaseID) throws IOException 
	{
          File  Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(Source);
	                                                            //101
	     File Destination=new File("C:\\Users\\mayur\\eclipse-workspace\\Insurance_Domain\\Screenshot\\"+TestCaseID+".jpg");
	     
	     FileHandler.copy(Source,Destination);
	}

}
