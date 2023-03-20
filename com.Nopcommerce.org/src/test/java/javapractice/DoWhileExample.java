package javapractice;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DoWhileExample {

		public static void main(String[] args) throws Exception {

			

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

			driver.findElement(By.id("Email")).clear();

			driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

			driver.findElement(By.id("Password")).clear();

			driver.findElement(By.id("Password")).sendKeys("admin");

			driver.findElement(By.xpath("//*[text()='Log in']")).click();

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()=' Dashboard']"))));

			driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()=' Products']")).click();

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("SearchCategoryId"))));
			
			int count = 0;
			String val = "";

			do {

				count = count + driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr")).size();
				System.out.println(count);
				Thread.sleep(4000);

				val = driver.findElement(By.id("products-grid_next")).getAttribute("class");

				if (!val.contains("disabled")) {
					driver.findElement(By.id("products-grid_next")).click();
					Thread.sleep(4000);
				}

			} while (val.contains("disabled") != true);

			System.out.println("Total rows val is : " + count);

			Thread.sleep(5000);

			driver.quit();

		}

	}

	
	


