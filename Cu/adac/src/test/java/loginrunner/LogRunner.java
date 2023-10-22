package loginrunner;

import org.junit.runner.RunWith;

import baseClass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featurefiles/backgroun.feature", glue = {"stepdefetions"}, junit = "--step-notifications", snippets = SnippetType.CAMELCASE, monochrome = true)



public class LogRunner{
	

}














//"html:target/cucumber-html-report","json:target/cucumber-json-report",----->html and xml format synatx for reports   ----->"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})