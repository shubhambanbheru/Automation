package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac3 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	driver.get("https://blazedemo.com/vacation.html");
		
	    Thread.sleep(2000);	
	    
	System.out.println(driver.getCurrentUrl());    
	    System.out.println(driver.getTitle());
 
//	    String Title ="https://blazedemo.com/vacation.html";
//	    if(Title.contains("vacation")) {
//	    	System.out.println("verified");
//	    }
//	    else {
//	    	System.out.println("not verified");
//	    }
	
	
	
	}

}
