package com.cg.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="features" ,
glue = "com.cg.stepdef",
//tags = "@negative",
plugin = {"pretty","html:target/index.html","json:target/myreport.json","rerun:target/failedcases.txt"}
)
public class TestRunner {

}
