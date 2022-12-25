package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettitleAndGetcurrenturl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://www.facebook.com/");

				Thread.sleep(2000);

				String ExpectedResult="Facebook – log in or sign up";

				String Title = driver.getTitle();

				System.out.println(driver.getTitle());   // System.out.println(Title);

				if (Title.equals(ExpectedResult)){
				System.out.println("Correct title");
				}
				else{
				System.out.println("Incorrect title");
				}

				String Url =driver.getCurrentUrl();

				System.out.println(Url);

				if (Url.equals("https://www.facebook.com/")){
				System.out.println("correct url");
				}
				else{
				System.out.println("Incorrect url");
				}
				driver.quit();


	}
}
