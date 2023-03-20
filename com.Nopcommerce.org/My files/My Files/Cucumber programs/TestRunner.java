package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\703284782\\eclipse-workspace\\"
				+ "com.cucumberFramework.io\\src\\test\\resources\\Features",

		glue = { "stepDefinations" },
		stepNotifications = true,
		monochrome = true,
		plugin = {"pretty", "html:target/ITReports.html"},
		dryRun = false,
		strict = true,
		tags = "@Smoke or @Regression"

)

public class TestRunner {

}
