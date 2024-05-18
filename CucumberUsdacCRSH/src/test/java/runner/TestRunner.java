package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "src/test/java/features",
		
		glue = {"stepDef", "utilities" },
		
		plugin = {"pretty","html:target/cucumber.html","json:cucumber.json"}
		
		)



public class TestRunner {

	
	
	
}
