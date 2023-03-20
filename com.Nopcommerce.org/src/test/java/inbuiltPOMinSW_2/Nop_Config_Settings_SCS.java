package inbuiltPOMinSW_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nop_Config_Settings_SCS {
	
	public static void main(String[] args) throws Exception {
		// Setup the Browser Which browser we need to lunch
		WebDriverManager.chromedriver().setup();
		// Lunch the Browser
		WebDriver driver = new ChromeDriver();

		// Here WebDriverWait using for waiting page of webElement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Maximize the browser
		driver.manage().window().maximize();

		// Waiting for the some time until we get login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Lunch the NopCommerce Application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%");

		// This Statement Indicates for waiting for login page got loaded with email id
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

		// Creating a object for running the class at runtime passing setup the driver
		Nop_LoginPagePOM nlpPOM = new Nop_LoginPagePOM(driver);
		Nop_DashboardPagePOM ndpPOM = new Nop_DashboardPagePOM(driver);
		Nop_AllCommonModule nacmPOM = new Nop_AllCommonModule(driver);
		Nop_CS_Shoppingcartsettings ncsSCS = new Nop_CS_Shoppingcartsettings(driver);

		nlpPOM.enterEmailID();
		nlpPOM.enterPasswordID();

		boolean showsLp = nlpPOM.verifyLoginPage();

		if (showsLp == true) {
			nlpPOM.clickOnLoginBtn();
		} else {
			System.out.println("Login not Successful");
		}
		boolean appear = ndpPOM.verifyDashBoard();
		if (appear == true) {
			nacmPOM.clickOnConfiguration();
			wait.until(
					ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Settings')]"))));
			nacmPOM.clickOnSettings();
			wait.until(ExpectedConditions
					.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Shopping cart settings')]"))));
			nacmPOM.clickOnShippingCartSettings();
			wait.until(ExpectedConditions
					.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart settings')]"))));
		} else {
			System.out.println("Not loaded Shipping Cart Page");
		}

		boolean display = ncsSCS.verifyshoppingCS();
		if (display == true) {
			ncsSCS.multiStoreConfigSCS();
		} else {
			System.out.println("MultistoreConfiguration DropDown Values not loaded");
		}
		WebElement element1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(element1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(5000);		
		ncsSCS.entermaxShoppingCartItems();
		
		WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();			
		ncsSCS.enternoProductsMSC();
		WebElement element3 = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(element3).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		ncsSCS.enterWhishlist();
		Thread.sleep(2000);
		
		ncsSCS.clickOnSaveBtn();
		Thread.sleep(4000);
		
		ncsSCS.displayText();
		Thread.sleep(3000);
		
		nlpPOM.clickOnLogoutBtn();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
