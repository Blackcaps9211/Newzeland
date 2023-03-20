package pageObjectModel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramForNop_CommonUtilitiesPOM1 {

	WebDriver driver;

		public ProgramForNop_CommonUtilitiesPOM1(WebDriver d) {
			this.driver = d;
		}
	
	
	
By	Promotions = By.xpath("//*[contains(text(),'Promotions')]");
By Discounts =	By.xpath("//*[contains(text(),' Discounts')]");
By Affiliates =	By.xpath("//*[contains(text(),'Affiliates')]");
By  NewsletterSubscribers =	By.xpath("//*[contains(text(),' Newsletter subscribers')]");
By Campaigns =	By.xpath("//*[contains(text(),'Campaigns')]");
By LogOutButton = By.xpath("//*[contains(text(),'Logout')]");

public void clickonPromotions() {
	driver.findElement(Promotions).click();
	
}

public void clickOnDiscounts() {
	driver.findElement(Discounts).click();
	
}

public void clickOnAffiliates() {
	driver.findElement(Affiliates).click();
	
}

public void clickOnNewsletterSubscribers() {
	driver.findElement(NewsletterSubscribers).click();
	
}

public void clickOnCampains() {
	driver.findElement(Campaigns).click();
	
}

public void doLogOut() {
	driver.findElement(LogOutButton).click();
}






}
