package pageObjectModel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramForLoginPage_POM1 { // rule1:- Created class for LoginPage

	WebDriver driver;

	public ProgramForLoginPage_POM1(WebDriver d) {

		this.driver = d;
	}

	By username = By.id("Email");
	By password = By.id("Password"); // line no 12 to 15 we passed information of the Login page WebElements
	By checkbox = By.id("RememberMe");
	By login = By.xpath("//*[text()='Log in']");

	public void enterEmailId() {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("admin");
	}

	public void clickCheckBox() {
		driver.findElement(checkbox).click();
	}

	public void clickOnLoginButton() {
		driver.findElement(login).click();

	}

}
