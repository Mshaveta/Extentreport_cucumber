package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Google.feature", 
glue = { "Steps" }, 
tags = "@search", 
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
dryRun = false, monochrome = true)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
