package com.test.shop;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"com.test.shop.stepdefinitions","net.serenitybdd.cucumber.actors"}
)
public class CucumberTestSuite {

}
