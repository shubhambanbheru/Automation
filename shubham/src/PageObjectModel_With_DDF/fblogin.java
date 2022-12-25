package PageObjectModel_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin {

	@FindBy(id="email") private WebElement UN;
	@FindBy(id ="pass")private WebElement pass;
	@FindBy(name ="login")private WebElement login;
	@FindBy(xpath ="//div[@class=\"_9lsb _9ls8\"]")private WebElement click1;
	@FindBy(xpath ="//div[@class=\"_9lsb _9ls9\"]")private WebElement click2;

	public fblogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userid(String username) {
		UN.sendKeys(username);
	}
	public void Pass(String PW) {
		pass.sendKeys(PW);
	}
	public void click() {
		login.click();
	}
	public void click2() {
		click1.click();
	}
	public void click3() {
		click2.click();
	}
	
}
