package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", // features package
														// location
		glue = "stepDefinations",tags = "@PortalTest",monochrome= true,strict = true,// package name
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"junit:target/cukes.xml" })
public class TestRunner {

}
