package inbuiltPOMinSW_2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Nop_CS_Shoppingcartsettings {
	
	
	WebDriver driver;

	public Nop_CS_Shoppingcartsettings(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(text(),'Shopping cart settings')]")
	WebElement shoppingCartS;

	@FindBy(id = "store-scope-configuration")
	WebElement multiStoreConfig;

	@FindBy(id = "MiniShoppingCartProductNumber")
	WebElement noProductsMSC;
//	
//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	WebElement maxShoppingCartItems;
	@FindBy(id = "MaximumShoppingCartItems")
	WebElement maxShoppingCartItems;
	
	@FindBy(id = "MaximumWishlistItems")
	WebElement maxWishlistItems;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement saveBtn;
	
	@FindBy(xpath = "//div[@class='content-wrapper']/child::div")
	WebElement textD;

	public boolean verifyshoppingCS() {
		boolean valSCS = shoppingCartS.isDisplayed();
		return valSCS;
	}

	public void multiStoreConfigSCS() {
		Select multiSC = new Select(multiStoreConfig);
		List<WebElement> allOptMSCS = multiSC.getOptions();
		for (int i = 0; i <= allOptMSCS.size() - 1; i++) {
			System.out.println(allOptMSCS.get(i).getText());
		}
		multiSC.selectByVisibleText("All stores");
		multiSC.selectByIndex(0);
		System.out.println("All options count is: " + allOptMSCS.size());
	}

	public void entermaxShoppingCartItems() {
	
	maxShoppingCartItems.sendKeys("2000");
	}

	public void enternoProductsMSC() {

	noProductsMSC.sendKeys("2");
	}
	
	public void enterWhishlist() {
		maxWishlistItems.sendKeys("2000");
	}
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	public void displayText() {
		String txt = textD.getText();
		System.out.println("Text Message:"+ txt);
	}
	

}
