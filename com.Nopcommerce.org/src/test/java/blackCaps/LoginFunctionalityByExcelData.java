package blackCaps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionalityByExcelData {
WebDriver driver;
public LoginFunctionalityByExcelData(WebDriver d) {
this.driver =d;
}
@Test
public void setUpBrowser() throws Exception {
		
		// launch the chrome browser
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(co);
		
				driver.manage().window().maximize();
				
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
				Thread.sleep(2000);
}

	@Test 
	
	public void getDataFromExcel() throws Exception {

		//driver.findElement(By.id("Email")).clear();
//				//driver.findElement(By.id("Email")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("EmailId"));
//				driver.findElement(By.id("Email")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("EmailId"));
//
//				Thread.sleep(2000);
//
//				driver.findElement(By.id("Password")).clear();
//			
//				driver.findElement(By.id("Password")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("Password"));
//				Thread.sleep(2000);
//
//			
//				driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		
driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Reporter.log("Login Button Clicked Successfully");

	}

}
