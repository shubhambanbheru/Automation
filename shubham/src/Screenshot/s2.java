package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
	
	WebDriver web = new ChromeDriver();
	
	web.manage().window().maximize();
	
web.get("https://demoqa.com/frames");	

WebElement image = web.findElement(By.xpath("//h1[@id=\"sampleHeading\" and contains(text(),'This is a sample page')]"));

System.out.println(image.getText());

}
}