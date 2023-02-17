package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class brokenlinks {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Browser drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://maven.apache.org/download.cgi");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> list =driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		int brokenlinks =0;
		int emptyurl=0;
		int validlinks=0;
		for(WebElement list1:list) {
			String url = list1.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("URL is empty");
				emptyurl++;
			continue;
			}
			
			URL link =new URL(url);
			HttpURLConnection httpcode=(HttpURLConnection) link.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"link is not valid");
				brokenlinks++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"link is valid");

				validlinks++;
			}
				
		}
		
		System.out.println("Broken links = "+brokenlinks);
		System.out.println("Empty links = "+emptyurl);
		driver.quit();
	}
}
