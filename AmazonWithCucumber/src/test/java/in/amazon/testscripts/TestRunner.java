package in.amazon.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "Features",
					glue   = "in.amazon.testscripts"
					//,dryRun = true
				)

public class TestRunner extends AbstractTestNGCucumberTests{

}

	//This class is to run all the feature files on above location. Features folder of in.amazon.testscripts package

	// to run only one write as "Features//invalid_credentials.feature" on features =

	// if you add dryRun  = true. it will checks and creates glue code for the method that is not implemented