package testNGpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGexecution {

	WebDriver driver;
//	LoginPagetestNG LogTest = new LoginPagetestNG(driver);
//	VerifyLoginSuccess VerityTest = new VerifyLoginSuccess(driver);
//	Npo_Customers_CommaonUtility ComutilCust = new Npo_Customers_CommaonUtility(driver);
//	Search_Customer SearchCust = new Search_Customer(driver);

	@BeforeTest

	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	@Test(parameters = {"un", "pws"})

	public void LoginPagetestNG(String un, String pws) {

		LoginPagetestNG LogTest = new LoginPagetestNG(driver);
		
		LogTest.enterEmailId(un);
		LogTest.enterPassword(pws);
		LogTest.clickOnLogin();
	}
	
	@Test
	
	public void VerifyDash() {
		VerifyLoginSuccess VerityTest = new VerifyLoginSuccess(driver);
		VerityTest.getPageTitel();
		
	}
	
	@Test
	public void clickOnCustomers() {
		
		Npo_Customers_CommaonUtility ComutilCust = new Npo_Customers_CommaonUtility(driver);
		
		ComutilCust.clickOnCustomers();
		ComutilCust.clickOncustomers();
		
	}

	@Test 
	
	public void Search_Customer() {
		 
		Search_Customer SearchCust = new Search_Customer(driver);
        
		SearchCust.enterEmail();
		SearchCust.enterFristName();
		SearchCust.enterLastName();
		SearchCust.enterLastactivityfrom();
		SearchCust.enterLastactivityto();
		SearchCust.tableinfo();
		
	}
	
	
		
	
}
