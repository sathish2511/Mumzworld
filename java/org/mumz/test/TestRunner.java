package org.mumz.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Mumz.feature",glue="org.mumz.test",monochrome=true,plugin= {"html:target/cucumber-reports"})

public class TestRunner {

	
}
