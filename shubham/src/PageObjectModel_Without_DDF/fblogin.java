package PageObjectModel_Without_DDF;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class fblogin {
		
		//Declaration
		
		@FindBy(id="email")
		private WebElement UN;
		
		@FindBy(id="pass") private WebElement Pass;
		
		@FindBy(name ="login") private WebElement click;
		
		//Initialization
		
		public fblogin (WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void userid() {
			UN.sendKeys("9049367649");
		}
		
		public void pass() {
			Pass.sendKeys("shubham2102");
				}
		public void loginclick() {
			click.click();
		}

	}


