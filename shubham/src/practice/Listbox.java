package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Listbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Browser drivers//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://blazedemo.com/index.php");
		
//	List<WebElement> list =	driver.findElements(By.xpath("//select[@name=\"fromPort\"]//option"));
//	
//	System.out.println(list.size());
//	
//	for(WebElement list1:list) {
//		System.out.println(list1.getText());
//		if(list1.getText().equals("Portland")) {
//			list1.click();
//			System.out.println("Selected value ="+list1.getText());
//			break;
//		}
//	}
//	for(int i=1;i<=list.size();i++) {
//		
//	String city= list.get(i).getText();
//	
//	if (city.equals("Portland")) {
//		list.get(i).click();
//		
//		System.out.println("Selected vlaue = "+list.get(i).getText());
//		break;
//	}
//	
//	}
//		
		WebElement list =	driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
	Select s1=new Select(list);
//	s1.selectByVisibleText("Portland");
	s1.selectByIndex(3);
	
	}
}
