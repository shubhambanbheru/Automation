package PageObjectModel_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClassFB {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/#");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		FileInputStream file =new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\fb.xlsx");
		
	Sheet sh =	WorkbookFactory.create(file).getSheet("Sheet1");
//	String US =sh.getRow(1).getCell(0).getStringCellValue();
	fblogin lp =new fblogin(driver);
	lp.userid(sh.getRow(0).getCell(1).getStringCellValue());
	lp.Pass(sh.getRow(1).getCell(1).getStringCellValue());
	
	
	lp.click2();
	
	lp.click3();
	
	
	
	
	
	
	
	lp.click();
		
	}
	
}
