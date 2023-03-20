
package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Raghu {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login");

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text() = 'Log in']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[contains(text(), 'Catalog')]")).click();
		boolean catalogmodule = driver.findElement(By.xpath("//*[contains(text(), 'Catalog')]")).isDisplayed();

		System.out.println("Ths is catalog :" + catalogmodule);

		driver.findElement(By.xpath("//*[contains(text(),  'Products')]")).click();
		boolean productmodule = driver.findElement(By.xpath("//*[contains(text(), 'product')]")).isDisplayed();
		System.out.println("Ths is product: " + productmodule);

		Thread.sleep(1000);

		WebElement download = driver.findElement(By.name("download-catalog-pdf"));

		driver.findElement(By.tagName("a")).click();
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(download)).click();
		Thread.sleep(2000);
		boolean productinfo = driver.findElement(By.xpath("//*[contains(text(), 'Product info')]")).isDisplayed();

		System.out.println("Ths is product info " + productinfo);

		WebElement downloadS = driver.findElement(By.xpath("//*[contains(text(), 'Product info')]"));

		driver.findElement(By.tagName("label")).click();
		driver.findElement(RelativeLocator.with(By.tagName("label")).below(downloadS)).sendKeys("HP");
		Thread.sleep(2000);
		boolean productName = driver.findElement(By.xpath("//*[contains(text(), 'Product name')]")).isDisplayed();

		System.out.println("This is product info " + productName);

		driver.findElement(By.xpath("//*[contains(text(), 'Product name')]")).clear();
		driver.findElement(By.xpath("//*[contains(text(), 'Product name')]")).sendKeys("Asus N551JK-XO076H Laptop");
		boolean productnamePresence = driver.findElement(By.xpath("//*[contains(text(), 'Product name')]"))
				.isDisplayed();
		System.out.println("This is Verifying for storeId is:" + productnamePresence);
		Thread.sleep(2000);
		driver.findElement(By.id("SearchProductName")).click();
		driver.findElement(By.id("SearchProductName")).sendKeys("Asus N551JK-XO076H Laptop");
		boolean startDatePresence = driver.findElement(By.id("SearchProductName")).isDisplayed();
		System.out.println("This is Verifying for StartDate is:" + startDatePresence);
		Thread.sleep(6000);

		// *[contains(text(), 'Product name')]
//	SearchProductName

	}

}
