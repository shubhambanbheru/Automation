package Parametrization;

	import java.io.FileInputStream;

	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ReadDataClass1 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			
	//		String Path = "/Users/ranjeetkendre/Desktop/9JulyData.xlsx";
			
			FileInputStream file = new FileInputStream("C:\\Users\\shubh\\Downloads\\Book1.xlsx");
					
			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
			
			System.out.println(data);
		}

	

}
