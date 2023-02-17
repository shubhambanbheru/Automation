package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RD1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Desktop\\\\Test Report.xlsx");
		
		double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(data);
		
	}

}
