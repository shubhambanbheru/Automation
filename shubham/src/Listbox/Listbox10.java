package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox10 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
						
				driver.get("https://demo.automationtesting.in/Register.html");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Shubham");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Banbheru");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Shivaji Chouk,Lasalgaon");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("Banbherushubham@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9112345534");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
				
				List<WebElement> lan =driver.findElements(By.xpath("//div[@style=\"display: block;\"]//li"));
				
				System.out.println("Total Languages :"+lan.size());
				
				for(int k=0;k<lan.size();k++) {
					System.out.println(lan.get(k).getText());
					
					if(lan.get(k).getText().equals("Hindi")) {
						lan.get(k).click();
						break;
					}
				}
				Thread.sleep(1000);
	//			driver.findElement(By.xpath("//form[@id=\"basicBootstrapForm\"]")).click();        //not neccessary
			
				List<WebElement> skills=driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));

				System.out.println("Total Counts :"+skills.size());
				
				for(WebElement str:skills) {
					System.out.println(str.getText());
				}
				Thread.sleep(1000);
			System.out.println("===============================================");	
				for(int i=0;i<skills.size();i++) {
			//		System.out.println(skills.get(i).getText());
					
					if(skills.get(i).getText().equals("APIs")) {
					
						skills.get(i).click();
						
						System.out.println("Selected Skill :"+skills.get(i).getText());
						break;
				}
				}
				
				Thread.sleep(2000);
				
							
				
//				By select class -
//				
//				WebElement skills =driver.findElement(By.xpath("//select[@id=\"Skills\"]//option"));
//				
//				Select s1= new Select(skills);
//				
//				List<WebElement>Listskills =s1.getOptions();
//				
//				for(int i=0;i<Listskills.size();i++) {
//					
//					Listskills.get(i).getText();
//					
//					System.out.println(Listskills.get(i).getText());
//					
//					if(Listskills.get(i).getText().equals("APIs")) {
//					
//					Listskills.get(i).click();
//				}												
//				}
					
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
			
//		Thread.sleep(1000);
//		
//	WebElement year =driver.findElement(By.xpath("//select[@ng-model=\"yearbox\"]"));
//		
//	WebElement month =driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
//		
//	WebElement day =driver.findElement(By.xpath("//select[@ng-model=\"daybox\"]"));
//
//				String DOB ="8/6/1923";
//				
//				String ss[] =DOB.split("/");        //written type of split() is array[]
//				
//				list(year, ss[2]);
//				list(month,ss[1]);
//				list(day,ss[0]);
		
//		List<WebElement> skills1=driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));
//
//		System.out.println("Total Counts :"+skills1.size());
//		
//		for(WebElement str:skills1) {
//			System.out.println(str.getText());
//		}
//		
//	System.out.println("===============================================");	
//		for(int i=0;i<skills1.size();i++) {
//	//		System.out.println(skills1.get(i).getText());
//			
//			if(skills1.get(i).getText().equals("APIs")) {
//			
//				skills1.get(i).click();
//				
//				System.out.println("Selected value :"+skills1.get(i).getText());
//				break;
//		}
//		}
		
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
		
				
				driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("S@1234");
				
				driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("S@1234");
				
				driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
				
				
				Thread.sleep(3000);
				driver.close();
}
	
	

	
	
	
	
	
	
}
