package com.test.shop.stepdefinitions;

import com.test.shop.tasks.NavigateTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductAvailability {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} wants to check the availability of Jeans brands")
    public void thatStringwantstochecktheavailabilityofstringjeans(String actor){
        theActorCalled(actor).attemptsTo(NavigateTo.Myntra());

    }

    @When("When he tries to search the {string} brand in Myntra")
    public void whenhetriestosearchthestringbranchinmyntra(String brand){
        theActorInTheSpotlight().attemptsTo();
    }


}
