package Assignment;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assign2 {

				public static void main(String[] args) throws InterruptedException, IOException {

				System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
						
						WebDriver web = new ChromeDriver();
						
						web.manage().window().maximize();
						
				web.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
				
				Thread.sleep(2000);
				
			//	web.switchTo().frame("app");

				WebElement image = web.findElement(By.xpath("//div[@id=\"app\"]//div//div//div//div//div//img"));	//Absolute xpath

				//image.click();
						Thread.sleep(2000);

						
						File src =((TakesScreenshot)image).getScreenshotAs(OutputType.FILE);
						
						File dest =new File("C:\\Users\\shubh\\OneDrive\\Desktop\\logo.jpg");
						
					org.openqa.selenium.io.FileHandler.copy(src, dest);
					
						web.close();
					}

		}




