package Popup;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Popup1 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
				
					//	System.setProperty("webdriver.chrome.driver", "chromedriver");
						
						WebDriver driver = new ChromeDriver();
						
						driver.manage().window().maximize();
					
						driver.get("https://www.flipkart.com/");

						Thread.sleep(3000);
						
						driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		}

	}


