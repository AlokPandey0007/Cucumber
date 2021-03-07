package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"src\\test\\java\\StepDefinitions"},
monochrome=true,
plugin={"pretty","html:target/HTMLReports"})
public class TestRunner {
	

}
