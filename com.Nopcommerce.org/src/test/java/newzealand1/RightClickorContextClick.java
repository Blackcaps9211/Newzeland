package newzealand1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickorContextClick {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	Actions action = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[text()='jQuery UI'])[last()]"))));

		WebElement droppable = driver.findElement(By.xpath("//a[text()='Droppable']"));

		

//		action.moveToElement(droppable).perform();

		Thread.sleep(3000);

		action.contextClick(droppable).perform();

		Thread.sleep(3000);
		
		

	}

}
