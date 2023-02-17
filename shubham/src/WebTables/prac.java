package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElementMethods.GetText;

public class prac {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement moveto = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));

//	Actions action =new Actions(driver);
//	
//	action.moveToElement(moveto).perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", moveto);

		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();

		System.out.println("Total rows = " + row);

		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//th"));

		System.out.println("Total col = " + col.size());

		for (WebElement col1 : col) {
			System.out.print(col1.getText() + " | ");
		}

		for (int i = 2; i <= row; i++) {

			for (int j = 1; j <= col.size(); j++) {

				String text = driver
						.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[" + i + "]//td[" + j + "]"))
						.getText();

				System.out.print(text + " | ");

			}
			System.out.println();
		}
	}
}
