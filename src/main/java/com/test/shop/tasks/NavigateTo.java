package com.test.shop.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {

    private NavigateTo(){

    }
    public static Performable myntra(){
        return Task.where("{0} opens Myntra in browser",
                Open.browserOn().thePageNamed("baseurl"));
    }


}
