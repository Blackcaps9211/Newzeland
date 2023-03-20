package pageObjectModel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramForNop_DiscountsPagePOM1 {
	
	WebDriver driver;
	public ProgramForNop_DiscountsPagePOM1(WebDriver d) {
		this.driver = d;
	}
	
	
	
	By Discounts = By.xpath("//*[contains(text(),' Discounts')]");
	By Dis_AddnewButton = By.xpath("//a[@class='btn btn-primary']");
	By Dis_StartDate = By.xpath("//input[@id='SearchStartDate']");
	By Dis_EndDate = By.xpath("//input[@id='SearchEndDate']");
	By Dis_discountsType = By.xpath("//select[@id='SearchDiscountTypeId']");
	By Dis_CoopanCode = By.xpath("//input[@id='SearchDiscountCouponCode']");
	By Dis_discountsName = By.xpath("//input[@id='SearchDiscountName']");
	By Dis_IsActive = By.xpath("//select[@id='IsActiveId']");
	
	
	public boolean verifyDiscounts() {
	boolean verify = driver.findElement(Discounts).isDisplayed();
		return verify;
	}
	
	public void Dis_AddnewButton() {
		driver.findElement(Dis_AddnewButton).click();
		
	}
	
	public void Dis_StartDate() {
		driver.findElement(Dis_StartDate).click();
		driver.findElement(Dis_StartDate).sendKeys("22/07/1992");
	}

public void Dis_EndDate() {
		driver.findElement(Dis_EndDate).click();
		driver.findElement(Dis_EndDate).sendKeys("30/07/1992");
	
	}

public void Dis_discountsType() {
	    driver.findElement(Dis_discountsType).click();
//	    driver.findElement(Dis_discountsType).
	
}

public void Dis_CoopanCode() {
	    driver.findElement(Dis_CoopanCode).click();
	    driver.findElement(Dis_CoopanCode).sendKeys("cop1234");
	
}

public void Dis_discountsName() {
	driver.findElement(Dis_discountsName).click();
	driver.findElement(Dis_discountsName).sendKeys("xyz");
}

public void Dis_IsActive() {
	driver.findElement(Dis_IsActive).click();
//	driver.findElement(Dis_IsActive).
	
}
	
	
	
	
	
	
}
