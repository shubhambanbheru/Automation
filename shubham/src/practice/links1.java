package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Browser drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		int brokenlinks = 0;
		int emptyurl = 0;
		for (WebElement links1 : links) {
			String url = links1.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is Empty");
				emptyurl++;
				continue;
			}

			URL urllink = new URL(url);

			HttpURLConnection httpcode = (HttpURLConnection) urllink.openConnection();
			httpcode.connect();

			if (httpcode.getResponseCode() >= 400) {
				System.out.println(httpcode.getResponseCode() + "-->" + url + "-->" + "link is not valid");
				brokenlinks++;

			} else {
				System.out.println(httpcode.getResponseCode() + "-->" + url + "-->" + "link is valid");

			}

		}
		System.out.println("brokenlinks = " + brokenlinks);
		System.out.println("Empty url = " + emptyurl);
		driver.quit();
	}

}
