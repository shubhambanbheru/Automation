package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWT1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebElement scroll =driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();", scroll);
	
int row =	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();

System.out.println("Total Rows = "  +row);


List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
	
System.out.println("Total col ="+col.size());

for(WebElement col1:col) {
	System.out.print(col1.getText()+ " | ");
}
System.out.println();

//for getting all the data =

for (int i=2;i<=row;i++) {
	for(int j=1;j<=col.size();j++) {
		
		String text =	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	
	System.out.print(text +" | ");
	
//	if(text.equals("Italy")) {
//	
//		System.out.println(text);
//		
//		System.out.println("Row no =" +i+ "  "+"Col no =" +j);
//		
//		continue;
//		
	//}

	}
	
	System.out.println();
}
	
		
	driver.quit();
	
	
	
	
	
}
}