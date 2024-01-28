package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Features/Login.feature",
		glue="Testsuites",
		tags="@tag1",
		plugin= {"pretty","html:target/cucumber-report.html"}
		)
public class Runner {

}
