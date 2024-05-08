package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "src/test/resources/features",
		
		glue = {"src/test/stepDef", "utilities" },
		
		plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
		
		)



public class TestRunner {

	
	
	
}
