package newzealand1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;	
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syncranizationforimplicitlywait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		Timeouts time = driver.manage().timeouts();
		
//		Synchronization implicit  dynamic methods 
		
		time.implicitlyWait(Duration.ofSeconds(20));
//		time.pageLoadTimeout(Duration.ofSeconds(20));
//		time.scriptTimeout(Duration.ofSeconds(20));

	}

}
