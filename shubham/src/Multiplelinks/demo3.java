package Multiplelinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.swiggy.com/");
	
				driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				
			List<WebElement> links =	driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());
			
			for(WebElement element:links) {
			
		String url =element.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("url is Empty");
				continue;
			}
			
			URL link =new URL(url);
			HttpsURLConnection hc = (HttpsURLConnection) link.openConnection();
			hc.connect();
			int rc =hc.getResponseCode();
			if(rc>=400) {
				System.out.println(rc +"--->"+url+"--->"+"Broken link");
				
			}
			else {
				System.out.println(rc +"--->"+url+"--->"+"Valid link");
			}
			}
				
	
	}
}
