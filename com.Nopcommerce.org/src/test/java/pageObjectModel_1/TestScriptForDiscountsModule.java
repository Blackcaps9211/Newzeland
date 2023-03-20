package pageObjectModel_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScriptForDiscountsModule {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		ProgramForLoginPage_POM1 login = new ProgramForLoginPage_POM1(driver);
		ProgramForDashbordPagePOM1 Dashbord = new ProgramForDashbordPagePOM1(driver);
		ProgramForNop_CommonUtilitiesPOM1 Utiliti = new ProgramForNop_CommonUtilitiesPOM1(driver);
		ProgramForNop_DiscountsPagePOM1 Discounts = new ProgramForNop_DiscountsPagePOM1(driver);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

		login.enterEmailId();
		login.enterPassword();
		login.clickCheckBox();
		login.clickOnLoginButton();

		Utiliti.clickonPromotions();
		Thread.sleep(3000);

		Utiliti.clickOnDiscounts();

		Discounts.Dis_StartDate();
		Thread.sleep(3000);

		Discounts.Dis_EndDate();
		Thread.sleep(3000);

		Discounts.Dis_CoopanCode();
		Thread.sleep(3000);

		Discounts.Dis_discountsName();

	}

}
