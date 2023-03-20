package inBuiltPOMinSW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScriptPOMinSW {

	public static void main(String[] args) throws Exception {
		
		
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    
    
    Loginpage2 login = new Loginpage2(driver);
    Dashbord2 Dash = new Dashbord2(driver);
    CommonUtilforConfiguration cuc = new CommonUtilforConfiguration(driver);
    ShippingCartPage shippingcart= new ShippingCartPage(driver);
		
		
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
    
    login.enterEmailId();
    login.enterPassword();
    login.clickCheckBox();
    login.clickOnLoginButton();
    
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[contains(text(),'Dashboard')])[last()]"))));
    
    Dash.verifyDashboard() ;
   
    cuc.clickOnConfiguration();
    cuc.clickOnSettings();
    cuc.clickOnShoppingcartsettings();
    
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[contains(text(),'Shopping cart settings')])[last()]"))));
    
    
    shippingcart.selectMultistoreconfigurationfor();
    
    Thread.sleep(3000);
    shippingcart.enterMaximumshoppingcartitems();
    Thread.sleep(3000);

    shippingcart.enterNumberofproductsinminishoppingcart();
    Thread.sleep(3000);

    shippingcart.enterMaximumwishlistitems();
    Thread.sleep(3000);

    shippingcart.saveButton();
    Thread.sleep(3000);
    
    shippingcart.displyText();

    
    
    driver.quit();
    
    
    
    
    
    
    
		
		
	}

}
