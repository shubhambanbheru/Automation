package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Book1.xlsx");
		
		 Sheet sh =WorkbookFactory.create(file).getSheet("Sheet1");
		 
		String username = sh.getRow(1).getCell(0).getStringCellValue();
	String password =sh.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
//	Thread.sleep(5000);
	
	String Actualtext =driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	//System.out.println(Actualtext);
	Thread.sleep(2000);
	String name =	sh.getRow(1).getCell(2).getStringCellValue();

		if(name.equals(Actualtext)) {
			System.out.println(Actualtext);
	}
		else {
			System.out.println("hello");
		}
//driver.quit();
	}
}
