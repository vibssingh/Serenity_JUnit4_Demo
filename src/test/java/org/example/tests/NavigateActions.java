package org.example.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {

    @Step
    public void toTheHomePage() {
        // openUrl("https://opensource-demo.orangehrmlive.com/");

        openPageNamed("loginForm");
    }
}
