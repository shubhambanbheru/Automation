package Parametrization;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadDataClass3 {

		public static void main(String[] args) throws IOException {
			
			String Path = "C:\\Users\\shubh\\Downloads\\Book1.xlsx";
			
			FileInputStream file = new FileInputStream(Path);
			
			XSSFWorkbook   Workbook = new XSSFWorkbook(file);
			
			XSSFSheet Sheet  = Workbook.getSheetAt(0);
			  
			 int Row = Sheet.getLastRowNum();
			 
			 System.out.println(Row+1);
			
			int Col= Sheet.getRow(0).getLastCellNum();
			System.out.println(Col);
			
			
			
		}

	}

