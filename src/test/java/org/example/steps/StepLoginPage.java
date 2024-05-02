package com.example;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StepLoginPage extends PageObject {

    @FindBy(name = "username")
    WebElementFacade username;

    @FindBy(name = "password")
    WebElementFacade password;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElementFacade submitButton;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    WebElementFacade errorMessage;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    WebElementFacade linkText;

    @Step("Enter Username")
    public void inputUserName(String userName) {
        username.sendKeys((userName));
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        password.sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        submitButton.click();
    }

    @Step("Error Message on unsuccessful login")
    public String errorMessage() {
        String actualErrorMessage = errorMessage.getText();
        return actualErrorMessage;
    }

    @Step("Click Forget Password Link")
    public void clickForgetPasswordLink() {
        linkText.click();

        System.out.println("Clicked on Forgot Password Link");
    }

}