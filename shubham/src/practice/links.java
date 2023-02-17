package practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.net.ssl.HttpsURLConnection;

public class links {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Browser drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links =" + links.size());
		int brokenlinks = 0;
		for (WebElement links1 : links) {
			String url = links1.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is Empty = "+url);
				continue;
			}
			// System.out.println(links1.getText());

			URL link = new URL(url);
			@SuppressWarnings("deprecation")
			javax.net.ssl.HttpsURLConnection httpcode =(javax.net.ssl.HttpsURLConnection) link.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"is broken link");
				brokenlinks++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"is valid");
			}
		}

		driver.quit();
	}
}
