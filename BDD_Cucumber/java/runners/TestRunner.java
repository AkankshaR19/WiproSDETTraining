package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions
	(
		features=	"src/test/resources/features/Login.feature",
		
		glue= {"stepdefinition", "hooks"},
		
		
				plugin = {
				        
				        "pretty",
				        
				        "html:target/cucumber-report.html",
				        
				        "json:target/cucumber.json",
				        
				        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		
		monochrome=true,
		tags="@Smoke or @Regression")
			
   public class TestRunner extends AbstractTestNGCucumberTests
   {
		
   }
