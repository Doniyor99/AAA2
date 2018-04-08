package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		tags="@smoke",
		plugin = {"html:target/cucumber", "json:target/json_reports/report.json"},
		glue = "stepDefinitions",
		features="./src/test/resources/com/etsy/features",
		dryRun = false
		
		)

public class CukesRunner {

}
