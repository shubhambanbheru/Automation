package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Browser drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("nashik");
		
	//	driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("pune");
	
		driver.findElement(By.linkText("https://st.redbus.in/images/offers/dussera_rav/274x148_EarlyBus.png")).click();
		
//		driver.findElement(By.xpath("//div[@class=\"tac promotion-header main-header-family gtm-offer-code\"]")).click();
		
//		driver.findElement(By.xpath("//input[@data-caleng=\"25-Sep-2022\"]")).click();
	
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		Thread.sleep(2000);

		
		driver.quit();
	
		
		
		
		
	}

}
