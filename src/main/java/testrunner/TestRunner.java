package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/cb-mithra/work/cucumber_wf_batch2/src/main/java/feature/TestCase1.feature",
glue="stepdefinitions",
tags="@tag1",
plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"},
dryRun=true)
public class TestRunner {

}
