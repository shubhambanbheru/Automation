package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RD4 {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\\\Users\\\\shubh\\\\Downloads\\\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	int row =sheet.getLastRowNum();
	
	int cell =sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<=row;i++) {
		
		XSSFRow row1 =sheet.getRow(i);
		
		for(int c=0;c<cell;c++) {
			
		XSSFCell cell1=	row1.getCell(c);
		
		switch(cell1.getCellType()) {
		
		case STRING:System.out.print(cell1.getStringCellValue());
		break;
		case NUMERIC: System.out.print(cell1.getNumericCellValue());
		break;
		case BOOLEAN:System.out.print(cell1.getBooleanCellValue());
		break;
		
	default:	System.out.println("hello");
		}
		System.out.print(" | ");
		}
		
		System.out.println();
	}
	
	
	}
	}

