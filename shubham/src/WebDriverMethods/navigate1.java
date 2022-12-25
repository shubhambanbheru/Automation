package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate1 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		
	//	String URL =driver.getCurrentUrl();
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
	//	String T1 = driver.getTitle();
		
		

	//	driver.manage().window().maximize();

		Point p1 = new Point(100,100);
		
		driver.manage().window().setPosition(p1);
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com/#");
		
	//	String Title = driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		driver.navigate().back();		//youtube
		Thread.sleep(1000);
		driver.navigate().forward();	//facebook
		Thread.sleep(1000);	
		driver.navigate().refresh();	//facebook
		Thread.sleep(1000);	
		
		Dimension d1 =new Dimension(1000,800);
		
		driver.manage().window().setSize(d1);
		
		Point p2 = new Point(300,400);
		
		driver.manage().window().setPosition(p2);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.navigate().back();		//youtube
		Thread.sleep(1000);
		driver.close();


	}

	
	}


