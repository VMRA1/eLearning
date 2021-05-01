package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},glue={"stepDefinitions"},dryRun=false,
plugin= {"html:testoutput/results.html","json:testoutput/results.json"})
public class Test_Runner extends AbstractTestNGCucumberTests {

}
