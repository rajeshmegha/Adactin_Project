package com.Facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefiles/fblogin.feature", glue = "step")
public class Facebook_Runnerfile {

}
