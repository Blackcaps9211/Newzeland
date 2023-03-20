package inbuiltPOMinSW_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nop_DashboardPagePOM {

	
	WebDriver driver;
	
	public Nop_DashboardPagePOM(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement dashBoard;
	
	public boolean verifyDashBoard() {
		boolean val = dashBoard.isDisplayed();
		return val;
	}
	
}
