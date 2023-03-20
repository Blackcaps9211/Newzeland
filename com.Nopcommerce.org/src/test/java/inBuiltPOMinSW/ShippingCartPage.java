package inBuiltPOMinSW;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingCartPage {
	
	WebDriver driver;
	public ShippingCartPage(WebDriver d) {
	this.driver = d;
	PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.ID,using="store-scope-configuration")                     //At
	WebElement Multistoreconfigurationfor;
	
	
	
	
	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[2]")
	WebElement Maximumshoppingcartitems;

	
	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[6]")
	WebElement Numberofproductsinminishoppingcart;
	
	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[8]")
	WebElement Maximumwishlistitems;

	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	WebElement button;
	// get text
	@FindBy(how = How.XPATH,using = "//div[@class='content-wrapper']/child::div")
	
	WebElement Text;
	
	public void selectMultistoreconfigurationfor(){                               // at
		Select selection = new Select(Multistoreconfigurationfor);
		selection.selectByIndex(0);

		}
	
	
	
	
	
	
	
	public void enterMaximumshoppingcartitems() throws Exception {
		
		Actions action = new Actions(driver);
		action.moveToElement(Maximumshoppingcartitems).perform();
		Thread.sleep(2000);
		action.doubleClick().click().sendKeys(Keys.BACK_SPACE).sendKeys("1500").perform();
		Thread.sleep(3000);
		
	}
	
	public void enterNumberofproductsinminishoppingcart() throws Exception {
	
		Actions action1 = new Actions(driver);
		action1.moveToElement(Numberofproductsinminishoppingcart).perform();
		Thread.sleep(2000);
		action1.doubleClick().click().sendKeys(Keys.BACK_SPACE).sendKeys("7").perform();
		Thread.sleep(2000);
		
		
	}
	
	public void enterMaximumwishlistitems() throws Exception {
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(Maximumwishlistitems).perform();
		Thread.sleep(2000);
		action2.doubleClick().click().sendKeys(Keys.BACK_SPACE).sendKeys("2000").perform();
		Thread.sleep(2000);
		
		
	}
	
	public void saveButton() throws Exception {
		button.click();
		
		Thread.sleep(2000);
		
		
	}
	
	
	
	public void displyText() {
		
		String text = Text.getText();
		System.out.println("TextMessage:" + text);
		
	}
	
	
	
	
	
	
	
	
	
}
