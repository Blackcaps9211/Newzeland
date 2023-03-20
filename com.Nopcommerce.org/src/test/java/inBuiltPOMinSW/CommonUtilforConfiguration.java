package inBuiltPOMinSW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommonUtilforConfiguration {

	WebDriver driver;
	public CommonUtilforConfiguration(WebDriver d) {
	this.driver = d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH,using="//*[contains(text(),'Configuration')]")
	WebElement Configuration;
	
	@FindBy(how = How.XPATH, using="//*[contains(text(),'Settings')]")
	WebElement Settings ;
	
	@FindBy(how = How.XPATH, using="//*[contains(text(),' Shopping cart settings')]")
	WebElement Shoppingcartsettings;
	
	
	public void clickOnConfiguration() {
		Configuration.click();
	}
	
	public void clickOnSettings() {
		Settings.click();
	}
	
	public void clickOnShoppingcartsettings() {
		Shoppingcartsettings.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
