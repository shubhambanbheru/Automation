
package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//span[@id=\"select2-country-container\"]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]")).click();
		
		
		List<WebElement> country=	driver.findElements(By.xpath("//span[@class=\"select2-results\"]//li"));
			
	System.out.println( "Country size :"+country.size());	
	
	for(int j=0;j<country.size();j++) {
		System.out.println(country.get(j).getText());
		
		if(country.get(j).getText().equals("India")) {
			country.get(j).click();
			
			break;
						}
	}
	}

}
