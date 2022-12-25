package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiltle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    String ExpectedResult ="Facebook – log in or sign up";
	    
	    Thread.sleep(4000);
	    
	  //  System.out.println(driver.getTitle());
	    
	    String Title =driver.getTitle();	    
	    
	    System.out.println(Title); 
	    
	    if(Title.equals(ExpectedResult)) {
	    	System.out.println("Correct title");
	    }
	    else {
	    	System.out.println("Incorret title");
	    }
	    driver.quit();
	    
	}

}
