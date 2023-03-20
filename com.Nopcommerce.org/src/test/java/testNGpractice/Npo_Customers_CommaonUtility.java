package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Npo_Customers_CommaonUtility {

	WebDriver driver;
	public Npo_Customers_CommaonUtility(WebDriver d) {
		this.driver = d;
	}
	
	By Customers = By.xpath("(//*[contains(text(),'Customers')])[1]");
	By customers = By.xpath("(//*[contains(text(),'Customers')])[2]");
	By customerRoles = By.xpath("//*[contains(text(),' Customer roles')]");
	By Onlinecustomers = By.xpath("//*[contains(text(),' Online customers')]");
	By Venders = By.xpath("//*[contains(text(),' Vendors')]");
	By ActivityLog = By.xpath("//*[contains(text(),' Activity log')]");
	By ActivityTypes = By.xpath("//*[contains(text(),' Activity Types')]");
	By GDPR = By.xpath("//*[contains(text(),' GDPR requests (log)')]");
	
	public void clickOnCustomers() {
		driver.findElement(Customers).click();
	}
	
	public void clickOncustomers() {
		driver.findElement(customers).click();
		
	}
	
	public void clickOncustomerRoles() {
		driver.findElement(customerRoles).click();
	}
	
	public void clickOnOnlinecustomers() {
		driver.findElement(Onlinecustomers).click();
	}
	
	public void clickOnVenders() {
		driver.findElement(Venders).click();
	}
	
	public void clickOnActivityLog() {
		driver.findElement(ActivityLog).click();
	}
	
	public void clickOnActivityTypes() {
		driver.findElement(ActivityTypes).click();
	}
	
	public void clickOnGDPR() {
		driver.findElement(GDPR).click();
	}
	
	
		
	
}
