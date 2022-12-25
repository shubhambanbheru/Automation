package Popup;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class PermissionPopup {

		public static void main(String[] args) {

			
			ChromeOptions  Option = new ChromeOptions();
			
			Option.addArguments("--disable-notifications");
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
								
			WebDriver driver = new ChromeDriver(Option);
						
		    driver.manage().window().maximize();
					
		    driver.get("https://www.hdfcbank.com/");
						
						
		}

	

}
