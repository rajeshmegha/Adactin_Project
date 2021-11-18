package com.adactin.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefiles/fb_header_datatable.feature",

glue =  "step",

tags = "~@fblogin")

//monochrome = true,

//strict  = true)
	
public class Browser_Runnerfile {
	
	
	
	
	
	

}
