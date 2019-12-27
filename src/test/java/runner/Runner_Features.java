package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// feature is path to the feature file
		features = {"src/test/java/regression_Features/Login.feature"},
		glue = "step_definition_Regression" ,
		// glue is path to step definition file
		monochrome = true, //display the console output in a proper readable format
		strict = true, 
		dryRun = true) 


public class Runner_Features {

	
}
