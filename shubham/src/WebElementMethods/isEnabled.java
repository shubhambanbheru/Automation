package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		
		driver.get("https://www.functionize.com/h/test-automation?utm_source=google&utm_medium=paid%20search&utm_campaign=automated%20web%20testing&utm_term=automated%20web%20testing&utm_campaign=Z+-+India+-+Automated+Web+Testing&utm_source=adwords&utm_medium=ppc&hsa_acc=5488573823&hsa_cam=16375912712&hsa_grp=133300773506&hsa_ad=583785827755&hsa_src=g&hsa_tgt=kwd-304942589907&hsa_kw=automated%20web%20testing&hsa_mt=p&hsa_net=adwords&hsa_ver=3&gclid=Cj0KCQjw48OaBhDWARIsAMd966B71kpo9wVbP8a1Cio41CXr-JpB-4ENeGee6bK9nSai7m_f1zU309saArpVEALw_wcB");
		Thread.sleep(2000);
		boolean b =driver.findElement(By.xpath("//input[@value='Yes']")).isEnabled();
	
		System.out.println(b);
	
	}

}
