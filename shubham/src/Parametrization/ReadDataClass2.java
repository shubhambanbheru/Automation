package Parametrization;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ReadDataClass2 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	       String Path = "/Users/ranjeetkendre/Downloads/Untitled spreadsheet (2).xlsx";
			
			FileInputStream file = new FileInputStream(Path);
					
			double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
			
			System.out.println(data);
		}

	}

