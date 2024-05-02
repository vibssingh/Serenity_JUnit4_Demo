package org.example.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StepForgotPasswordPage extends PageObject {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/div/form/h6")
    WebElementFacade forgetLink;


    @Step("Verify Forget Password Page ")
    public String getHeadingForgetPasswordPage() {

        return forgetLink.getText();
    }
}