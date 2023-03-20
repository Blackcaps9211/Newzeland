package testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blackCaps.ReadExceldataForLoginfunctionality;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {
	 WebDriver driver;
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));


@BeforeTest	
	
	public void setUp() {
	
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
       
       
		    


}
	
@Test	
public void Login() throws Exception {
	
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("EmailId"));
	
	driver.findElement(By.id("Password")).clear();
	driver.findElement(By.id("Password")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("Password"));
	
	driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();

	
}

	@Test
public void verifyDashBord() {

		Assert.assertEquals("Dashboard / nopCommerce administration", "Dashboard / nopCommerce administration");

}
	@Test
public void clickOnCatalog() {
	
	driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
}
	
	
	
}
