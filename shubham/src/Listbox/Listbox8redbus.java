package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox8redbus {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
//		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		
		
//		WebElement s1 =driver.findElement(By.xpath("//ul[@class=\"autoFill homeSearch\"]"));
//		
//		Select list =new Select(s1);
//		
//		List<WebElement> city=list.getOptions();
	
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));   //li is important
		//without li it gives output: total counts :1

		System.out.println("Total Counts :"+city.size());
		
		for(int i=0 ;i<city.size();i++) {
			
			String names =city.get(i).getText();
			
			System.out.println(names);
	//		System.out.println(city.get(i).getText());
									
			if (names.equals("Vallabhnagar, Pune")) {
				System.out.println(names);
				
				city.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		
		System.out.println("=============================================");
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		
		Thread.sleep(2000);
		
		List<WebElement> city1 =driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println("total counts :"+city1.size());
		
	// 	for each loop
		
//		for(WebElement str :city1) {
//			
//			System.out.println(str.getText());
//			
//			if (str.getText().equals("Lower Parel, Mumbai");) {
//				
//				System.out.println(str.getText());
//				
//				
//			}
//		}
//		
		
		
		
		for(int j=0;j<city1.size();j++) {
			String s2=city1.get(j).getText();
			
			System.out.println(s2);
			
			if(s2.equals("Lower Parel, Mumbai")) {
				
				System.out.println(s2);
				
				city1.get(j).click();
				
				break;
			}
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		driver.close();
	
	
	
	
	
	
	}
	
}
