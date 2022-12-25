package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			
			driver.get("https://cetcell.mahacet.org/CAP_landing_page_2022/");
			
			WebElement add =driver.findElement(By.xpath("//h3[contains(text(),'Official Address : 8th Floor, New Excelsior Building')]"));

			JavascriptExecutor js =(JavascriptExecutor) driver ;
			
			js.executeScript("window.scrollBy(0,6000)","");
			
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,-1000)", "");
			
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].scrollIntoView();",add);
			
			js.executeScript("arguments[0].style.border='3px solid red'", add);
			
			js.executeScript("arguments[0].style.background='yellow'", add);
			
//			js.executeScript("window.document(0,document.body.scrollHeight)", "");
//			
//			js.executeScript("document.documentElement.scrollTop=0","");
//			
}
}
