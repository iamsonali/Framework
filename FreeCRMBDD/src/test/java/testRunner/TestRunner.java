package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/lenovo/workspace/FreeCRMBDD/src/main/java/Features/facebook.feature",
		glue={ "glue"},
		format={"pretty","html:test-output","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		tags="@executeThis",
		dryRun=false
		)
public class TestRunner {
	
	}
