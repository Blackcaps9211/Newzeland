package inbuiltPOMinSW_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nop_AllCommonModule {
	
	
	WebDriver driver;
	public Nop_AllCommonModule(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath ="//p[contains(text(),'Configuration')]")
		WebElement configuration;	

		@FindBy(xpath = "//p[contains(text(),'Settings')]")
		WebElement settings;
		
		@FindBy(xpath = "//p[contains(text(),'Shopping cart settings')]")
		WebElement shippingCartSetting;
		
		
		
		public void clickOnConfiguration() {
			configuration.click();
		}

		public void clickOnSettings() {
			settings.click();
		}
		
		public void clickOnShippingCartSettings() {
			shippingCartSetting.click();
		}

}
