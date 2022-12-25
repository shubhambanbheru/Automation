package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("https://demo.automationtesting.in/Register.html")).click();
		
		Thread.sleep(2000);

//		String CurrentURL =driver.getCurrentUrl();
//		
//		if (CurrentURL.equals("https://www.facebook.com/")) {
//			
//			System.out.println("Correct URL");
//		}
//		else 
//			System.out.println("Incorrect URL");
//		
	driver.quit();
	
		
	}

}
