package nwezealandpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forloopdropdown {

	public static void main(String[] args) throws Exception {

		// launch the chrome browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				// maximize the browser
				driver.manage().window().maximize();

				// open nopcommrace url in opened browser
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

				Thread.sleep(7000);

				driver.findElement(By.id("Email")).clear();
				Thread.sleep(3000);
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

				driver.findElement(By.id("Password")).clear();
				Thread.sleep(3000);
				driver.findElement(By.id("Password")).sendKeys("admin");

				driver.findElement(By.xpath("//*[text()='Log in']")).click();
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[contains(text(), 'Catalog')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(), 'Products')]")).click();
				Thread.sleep(5000);

				WebElement categiry = driver.findElement(By.id("SearchCategoryId"));

				Select selection = new Select(categiry);

				List<WebElement> allOptions = selection.getOptions();

				for (int i = 0; i <= allOptions.size() - 1; i++) {

					System.out.println(allOptions.get(i).getText());

				}

				selection.selectByVisibleText("Electronics");

				Thread.sleep(4000);

				selection.selectByIndex(6);

				System.out.println("All option count is : " + allOptions.size());
		
		
	}

}
