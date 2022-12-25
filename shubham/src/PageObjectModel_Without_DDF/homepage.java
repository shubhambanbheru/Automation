package PageObjectModel_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	@FindBy(xpath ="//a[@aria-label=\"Home\"]") private WebElement home;
	
	@FindBy(xpath ="//span[contains(text(),'Shubham Banbheru')]") private WebElement name;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Name() {
		System.out.println(name.getText());
	}
	
	public void home() {
		String acttext =home.getText();
		
		String Exp ="Home";
		if(Exp.equals(acttext)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
