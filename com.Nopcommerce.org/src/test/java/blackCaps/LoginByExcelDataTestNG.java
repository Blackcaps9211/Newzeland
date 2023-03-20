package blackCaps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginByExcelDataTestNG {
	
	WebDriver driver;
	
public	LoginByExcelDataTestNG(WebDriver d) {
	this.driver=d;
}

@Test

public void setUpBrowser() {
	
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions co = new ChromeOptions();
//	co.addArguments("--remote-allow-origins=*");
//	 driver = new ChromeDriver(co);
//	
//			driver.manage().window().maximize();
//			
//			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	
			
			
}

@Test

public void getDataFromExcel() throws Exception {

	driver.findElement(By.id("Email")).clear();
			//driver.findElement(By.id("Email")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("EmailId"));
			driver.findElement(By.id("Email")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("EmailId"));

			Thread.sleep(2000);

			driver.findElement(By.id("Password")).clear();
		
			driver.findElement(By.id("Password")).sendKeys(ReadExceldataForLoginfunctionality.readExcelData().get(0).get("Password"));
			Thread.sleep(2000);

		
			driver.findElement(By.xpath("//*[text()='Log in']")).click();
	
	


}

}
