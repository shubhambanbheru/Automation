package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox6fb {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/#");
		Thread.sleep(2000);
	
		WebElement day1 =driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		
		day1.click();
		
		Thread.sleep(2000);
		
		WebElement day =driver.findElement(By.id("day"));
		
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
	
		Select s1=new Select(day);
		
		// Q.How will you get Total no. size
		
		List<WebElement> Listday =s1.getOptions();	//it will print all the options
		
		System.out.println("Total days :"+Listday.size());
		
		//Q2 How will you print all the values
		
		for(int i=0;i<Listday.size();i++) {
			
			String dayvalue =Listday.get(i).getText();
			System.out.println(dayvalue);
		//	System.out.println(Listday.get(i).getText());
			
		
			
			}
		System.out.println("================================================================");	
		Select s2 =new Select(month);
		
		List<WebElement> Listmonth =s2.getOptions();
		
		System.out.println("Total no. of months :"+ Listmonth.size());
		
		for(int j=0;j<Listmonth.size();j++) {
			
			String months =Listmonth.get(j).getText();
			
		System.out.println(months);
			
			//System.out.println(Listmonth.get(j).getText());
		}

		driver.close();
	}

}
