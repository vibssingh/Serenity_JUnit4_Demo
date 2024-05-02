package org.example.tests;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StepForgotPasswordPage extends PageObject {

    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/h1")
    WebElementFacade forgetLink;

    @Step("Verify Forget Password Page ")
    public String getHeadingForgetPasswordPage() {

        return forgetLink.getText();
    }
}