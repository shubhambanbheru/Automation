package Iframe;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class inspect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		   WebDriver driver = new ChromeDriver();
						
		   driver.manage().window().maximize();
				
		   Thread.sleep(3000);
		   
		   driver.get("https://www.facebook.com/");
		
	}
	}
	
