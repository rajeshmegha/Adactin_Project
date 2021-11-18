package com.adactin.runnerfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//dryrun is used to check wheather the stepdefinition and feature files are equal 
//while writing scenarios each and everylines should be different
//strict  it will first excecute and then checks both are equal
//strict deprecate is succeded by plugin
//Report generation : htmlreport,json report,pretty report,xml report.
//tags feature level and scenario level taggings with @ symbol


@RunWith(Cucumber.class)
@CucumberOptions(

features = "hotelfeature/adactin2.feature",
		
glue = "step",

//strict = true,
     
monochrome=true,

plugin = {"html:Report/Html","json:report/jsonreport.json"})
  
public class Runnerclass {
	
	
	}
 