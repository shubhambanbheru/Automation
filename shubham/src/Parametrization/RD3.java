package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RD3 {
	public static void main(String[] args) throws IOException {
		
	FileInputStream file =new FileInputStream("C:\\\\Users\\\\shubh\\\\Downloads\\\\Book1.xlsx");
	
//String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//System.out.println(data);
	
XSSFWorkbook workbook =new 	XSSFWorkbook(file);

	XSSFSheet sheet=	workbook.getSheet("Sheet1");
	
System.out.println(sheet.getLastRowNum()+1);

System.out.println(sheet.getRow(0).getLastCellNum());


	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
