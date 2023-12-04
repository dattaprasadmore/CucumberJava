package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Atharv\\git\\CucumberJava\\CucumberJava\\src\\test\\resources\\AppFeatures"},
		glue = {"StepDefinitions","AppHooks"},
		plugin = {"pretty"})
public class MyTestRunner {

	
}