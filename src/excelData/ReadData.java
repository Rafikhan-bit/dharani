package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadData 
{
	public static String readData(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("D://Excel/Data.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
	    String s1=w1.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	    return s1;
		
	}

}
