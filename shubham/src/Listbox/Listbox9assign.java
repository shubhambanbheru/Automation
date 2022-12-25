package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox9assign {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		List<WebElement> skills=driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));

		System.out.println("Total Counts :"+skills.size());
		
		for(WebElement str:skills) {
			System.out.println(str.getText());
		}
		
	System.out.println("===============================================");	
		for(int i=0;i<skills.size();i++) {
	//		System.out.println(skills.get(i).getText());
			
			if(skills.get(i).getText().equals("APIs")) {
			
				skills.get(i).click();
				
				System.out.println("Selected value :"+skills.get(i).getText());
				break;
		}
		}
		
		Thread.sleep(2000);
		//(8/06/1923)
		
		List<WebElement>year =driver.findElements(By.xpath("//select[@ng-model=\"yearbox\"]//option"));
		
		List<WebElement>month =driver.findElements(By.xpath("//select[@ng-model=\"monthbox\"]//option"));
		
		List<WebElement>day =driver.findElements(By.xpath("//select[@ng-model=\"daybox\"]//option"));
		
		System.out.println(year.size());
		
		
		for(WebElement str1:year) {
			System.out.println(str1.getText());
		}
		
		for(int j=0;j<year.size();j++) {
			
			if(year.get(j).getText().equals("1923")) {
				
				year.get(j).click();
				
				break;
				
				
			}
			
			
		}
		
		for(WebElement str2:month) {
			System.out.println(str2.getText());
		}
		
		for(int k=0;k<month.size();k++) {
			
			if(month.get(k).getText().equals("June")) {
				
				month.get(k).click();
				
				break;
				
				
			}
			
			
		}
		
		for(WebElement str3:day) {
			System.out.println(str3.getText());
		}
		
		for(int l=0;l<day.size();l++) {
			
			if(day.get(l).getText().equals("8")) {
				
				day.get(l).click();
				
				break;
				
				
			}
			
			
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
