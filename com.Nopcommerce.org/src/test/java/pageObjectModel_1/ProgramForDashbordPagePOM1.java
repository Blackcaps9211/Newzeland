package pageObjectModel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramForDashbordPagePOM1 {

	WebDriver driver;
	
	public ProgramForDashbordPagePOM1(WebDriver d) {
		this.driver =d;
	}
	
	
	By dashbord = By.xpath("(//*[contains(text(),'Dashboard')])[last()]");
	
	public  boolean verifyDashbord(){
		
		boolean ver = driver.findElement(dashbord).isDisplayed();
		return ver;
	}
	
	
}
