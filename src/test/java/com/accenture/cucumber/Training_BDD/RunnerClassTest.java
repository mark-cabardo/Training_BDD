package com.accenture.cucumber.Training_BDD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
  plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  features = {"src/test/resources/features"},
  tags = {"@DataTables"}
  ) 

public class RunnerClassTest {

}
