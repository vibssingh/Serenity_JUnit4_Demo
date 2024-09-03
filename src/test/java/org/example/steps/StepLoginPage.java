package org.example.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StepLoginPage extends PageObject {

    @FindBy(name = "username")
    WebElementFacade username;

    @FindBy(name = "password")
    WebElementFacade password;

    @FindBy(xpath = "//*[@class='oxd-form']/div[3]/button")
    WebElementFacade submitButton;

    @FindBy(xpath = "//*[@class='orangehrm-login-error']/div/div/p")
    WebElementFacade errorMessage;

    @FindBy(xpath = "//*[@class='orangehrm-login-forgot']/p")
    WebElementFacade linkText;

    @Step("Enter Username")
    public void inputUserName(String userName) {
        username.sendKeys(userName);
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        password.sendKeys(passWord);
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