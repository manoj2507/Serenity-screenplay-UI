package com.test.shop.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProductAvailability {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} wants to check the availability of {string} Jeans")
    public void thatStringwantstochecktheavailabilityofstringjeans(String actor,String brand){
        theActorCalled(actor).attemptsTo();

    }


}
