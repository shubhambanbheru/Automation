package Parametrization;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadDataClass4 {

		public static void main(String[] args) throws IOException {

		String Path = "C:\\\\Users\\\\shubh\\\\Downloads\\\\Book1.xlsx";
			
			FileInputStream file = new FileInputStream(Path);
			
			XSSFWorkbook   Workbook = new XSSFWorkbook(file);
			
			XSSFSheet Sheet  = Workbook.getSheetAt(0);
			  
			 int Row = Sheet.getLastRowNum();   //indexing
			 
			 int Cell = Sheet.getRow(0).getLastCellNum();  //
			 
			 for(int r =0 ;r<=Row;r++) {   //Outerforloop
				 
				XSSFRow Row1 = Sheet.getRow(r);  //0  
				
				for(int c =0 ; c<Cell; c++) {
					
					XSSFCell Cell1 = Row1.getCell(c);
					
	                switch(Cell1.getCellType()) {
					
	        		case STRING : System.out.print(Cell1.getStringCellValue());
				    break;
					
					case NUMERIC : System.out.print(Cell1.getNumericCellValue()); 
					break;
					
					case BOOLEAN : System.out.print(Cell1.getBooleanCellValue());  
					break;
					
					default :System.out.println("Hello");
								
					}
	                
	                System.out.print(" | ");
				}
				System.out.println();
			 }

		}

	
}
