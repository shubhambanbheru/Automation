package Popup;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AuthenticationPopup {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
						
		   driver.manage().window().maximize();
				
		   Thread.sleep(3000);
		   //https:usrname:password@the-internet.herokuapp.com/basic_auth
		   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		   
		   
		   String Text =driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		   
		System.out.println(Text);
		}

	

}
