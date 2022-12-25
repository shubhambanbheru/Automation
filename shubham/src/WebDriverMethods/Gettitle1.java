package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");

		Thread.sleep(2000);

		String ExpectedResult ="Login • Instagram";

		String Title =driver.getTitle();

		System.out.println(Title);

		//System.out.println(driver.getTitle());

		if(Title.equals(ExpectedResult)){

		System.out.println("Correct title");
		}
		else{
		System.out.println("Incorrect title");
		}
		driver.quit();
	}

}
