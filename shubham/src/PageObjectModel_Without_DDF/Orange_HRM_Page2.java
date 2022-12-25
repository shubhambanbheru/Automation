package PageObjectModel_Without_DDF;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Orange_HRM_Page2 {
	//1.
		@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
		private WebElement Name;
		
		@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
		public WebElement TimeatWork;
		
		
		// 2.
		public Orange_HRM_Page2(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//3.
		public void name() {
			String Text=Name.getText();
			System.out.println(Text);
			
			if(Text.equals("Paul Collings")) {
				System.out.println("Correct username");
			}
				else {
					System.out.println("incorrectusername");			
			}
		}
		public void Time() {
			Boolean Time=TimeatWork.isDisplayed();
			System.out.println(Time);
		}
	
}
