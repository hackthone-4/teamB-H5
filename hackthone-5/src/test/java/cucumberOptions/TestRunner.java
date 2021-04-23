package cucumberOptions;



import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@CucumberOptions (  
	    features = {"src/test/java/features"},
	    glue={"stepDefinations","hooks"},
	   // tags={"@smoke"},
	    plugin={"pretty"}
		)





public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}