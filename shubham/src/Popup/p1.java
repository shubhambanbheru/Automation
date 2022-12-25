package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().alert().accept();
	    
	    WebElement result =driver.findElement(By.xpath("//p[@id=\"result\"]"));
	    
	    result.click();
	    
	//    System.out.println(result.getText());
	//    String r =result.getText();
   String ExpectedResult ="You successfully clicked an alert";
	    
	   if(result.getText().equals(ExpectedResult)) {
		   System.out.println(result.getText());
		   
		   driver.close();
	   }
	}

}
