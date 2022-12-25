package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		String Expected = "Enjoy the following exclusive features on the redBus app\r\n"
				+ "Last Minute Booking - In a hurry to book a bus at the last minute? Choose the bus passing from your nearest boarding point and book in a few easy steps.\r\n"
				+ "Boarding Point Navigation - Never lose your way while travelling to your boarding point!\r\n"
				+ "Comprehensive Ticket Details- Everything that you need to make the travel hassle free - rest stop details, boarding point images, chat with co-passengers, wake-up alarm and much more!\r\n"
				+ "Enter your mobile number below to download the redBus mobile app.";
				
		String Text =driver.findElement(By.xpath("//div[contains(text(),'Enjoy')]")).getText();
	
		System.out.println(Text.equals(Expected));
	}

}
