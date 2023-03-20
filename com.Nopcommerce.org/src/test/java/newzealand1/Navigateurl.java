package newzealand1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigateurl {

	public static void main(String[] args) {
		// setup the chromedriver	
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				
				driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
				

	}

}
