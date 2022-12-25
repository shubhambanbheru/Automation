package Multiplelinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	int brokenlinks =0;

//	for(WebElement element:links) {
//	
//	String url =	element.getAttribute("href");
//	
//	if(url==null || url.isEmpty()) {
//		System.out.println("url is Empty or null");
//		continue;
//	}
//	
//	URL link =new URL(url);
//	HttpsURLConnection httpscode =(HttpsURLConnection) link.openConnection();
//	httpscode.connect();
//	
//	if(httpscode.getResponseCode()>=400) {
//		System.out.println(httpscode.getResponseCode() +"----->"+url+"----->"+"Link is broken");
//	}
//	else {
//		System.out.println(httpscode.getResponseCode() +"----->"+url+"----->"+"Link is valid");
//	}
//	
//	}
//	
	for(WebElement element:links) {
		
		String url=element.getAttribute("href");
		if(url==null || url.isEmpty()) {
			System.out.println("url is empty or null");
		}
		
		URL link =new URL(url);
		HttpsURLConnection httpscode = (HttpsURLConnection) link.openConnection();
		httpscode.connect();
		int rc =httpscode.getResponseCode();
		
		if(rc>=400) {
			System.out.println(rc+"--->"+url+"--->"+"Broken link");
		}
		
		else {
			System.out.println(rc+"--->"+url+"--->"+"Valid link");
		}
		}
	
	

	
	}
}



