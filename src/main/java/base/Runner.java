package base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature"
		,glue={"stepDefinition"},
		plugin= {"pretty"},
		dryRun=true	
		)

public class Runner {

}
