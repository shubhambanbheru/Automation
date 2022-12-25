package Parametrization;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadDataClass5 {

		public static void main(String[] args) throws IOException {

		String Path = "C:\\\\Users\\\\shubh\\\\Downloads\\\\Book1.xlsx";
			
			FileInputStream file = new FileInputStream(Path); // To find/open file
			
			XSSFWorkbook   Workbook = new XSSFWorkbook(file);
			
			XSSFSheet Sheet  = Workbook.getSheetAt(0);// Providing sheet name
			  
			 int Rowcount = Sheet.getLastRowNum();   //Return the row count
			 
			 int Cellcount = Sheet.getRow(2).getLastCellNum();  // Return the column count
			 
			 for(int r =0 ;r<=Rowcount;r++) {   //Outerforloop
				 
				XSSFRow CurrentRow = Sheet.getRow(r);  //Focus on current row number
				
				for(int c =0 ; c<Cellcount; c++) {
					
					String Value =CurrentRow.getCell(c).toString();
	                	
					System.out.print(" | " +Value);
	                }
								
				System.out.println();
	                
	                
				}
				
			 

		}

	}

