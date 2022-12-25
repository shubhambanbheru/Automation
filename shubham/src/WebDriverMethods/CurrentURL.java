package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		String URL ="https://www.instagram.com/accounts/login/";

		driver.get("https://www.instagram.com/accounts/login/");

		Thread.sleep(3000);

		String CurrentURL = driver.getCurrentUrl();

		System.out.println(driver.getCurrentUrl());

		if(URL.equals(CurrentURL)){

		System.out.println("Correct URL");
		}
		else{
		System.out.println("incorrect url");
		}
		driver.quit();


	}

}
