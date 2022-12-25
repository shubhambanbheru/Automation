package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
	
//		boolean	b =	driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
//	
////	b.click();
////	Thread.sleep(1000);
//	
//	
//	
//	System.out.println(b);
//	
//	driver.close();
		
			
					boolean b = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
					System.out.println(b);
					
					Thread.sleep(3000);			
					
					driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"FeMale\"]")).click();
					
					boolean b1=driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"FeMale\"]")).isSelected();
					System.out.println(b1);
					
					driver.close();

			}

		

}
