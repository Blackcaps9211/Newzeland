package stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinations {

	WebDriver driver;
	
	
	@Before(value = "@Smoke", order = 1)
	public void setUpOne() {
		System.out.println("Before Hook setUpOne");
	}
	
	@Before(value = "@Smoke", order = 0)
	public void setUpTwo() {
		System.out.println("Before Hook setUpTwo");
	}
	
	@After(value = "@Smoke", order = 1)
	public void tearDownOne() {
		System.out.println("After Hook tearDownOne");
	}
	
	@After(value = "@Smoke", order = 0)
	public void tearDownTwo() {
		System.out.println("After Hook tearDownTwo");
	}
	
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("BeforeStep Hook");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("Afterstep Hook");
	}
	
	

	@Given("launch the nop login page")
	public void launch_the_nop_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FCreate");

	}

	@When("user enter emailid and password")
	public void user_enter_emailid_and_password() {

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

	}

	@When("user click on loginBtn")
	public void user_click_on_login_btn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("verify login success or not")
	public void verify_login_success_or_not() throws Exception {
		System.out.println("Login success");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Given("^launch Login Page$")
	public void launch_Login_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FCreate");
	}
	
	@When("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_Un_and_Pws(String a, String b) { 
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(a);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(b);
	}
	
	
	@When("^click on LoginButton$")
	public void click_on_LoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("^verify Login success$")
	public void verify_Login_success() throws Exception {
		System.out.println("Login success");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	@Given("launch the valid URL in supported browser")
	public void launch_the_valid_url_in_supported_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FProduct%2FCreate");
	}

	@When("enter values in {string} field and {string} field")
	public void enter_values_in_field_and_field(String un, String pws) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(un);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pws);
	}

	@When("click on the login button to do login")
	public void click_on_the_login_button_to_do_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("verify login successfully functionality")
	public void verify_login_successfully_functionality() throws Exception {
		System.out.println("Login success");
		Thread.sleep(3000);
		driver.quit();
	}

	@When("^enter values in email field and password field$")
	public void enter_values_in_email_field_and_password_field(DataTable dataval) {	

//		List<List<String>> realData = dataval.asLists();
//		String val1 = realData.get(0).get(0);
//		String val2 = realData.get(0).get(1);
		
//		System.out.println(val1 + "	"+ val2);
		
		List<Map<String, String>> realData = dataval.asMaps();
		String val1 = realData.get(0).get("UserName");
		String val2 = realData.get(0).get("Password");
		
		System.out.println(val1 + "	"+ val2);
		
		
		
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(val1);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(val2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
