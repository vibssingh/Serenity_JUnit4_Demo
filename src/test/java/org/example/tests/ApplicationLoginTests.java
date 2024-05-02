package org.example.tests;

import net.serenitybdd.annotations.Pending;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.example.steps.StepDashBoardPage;
import org.example.steps.StepForgotPasswordPage;
import org.example.steps.StepLoginPage;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class ApplicationLoginTests {


    @Steps
    NavigateActions navigate;

    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashBoardPage dashboardPage;

    @Steps
    StepForgotPasswordPage forgetPasswordPage;


    @Test
    @Title("Login to application with invalid credential generates error message")
    public void invalidCredentials() {

        // Given
        navigate.toTheHomePage();

        // When
        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin");
        loginPage.clickLogin();

        // Then
        Serenity.reportThat("Passing invalid credentials generates error message",
                () -> assertTrue(loginPage.errorMessage().equalsIgnoreCase("Invalid Credentials")));

    }

    @Test
    @Title("Login to application with valid credentials navigates to DashBoard page")
    public void successfulLogin() {

        navigate.toTheHomePage();
        // loginPage.open();

        // When
        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLogin();

        // Then
        Serenity.reportThat("Passing valid credentials navigates to DashBoard page",
                () -> assertTrue(dashboardPage.getHeading().equalsIgnoreCase("DashBoard")));
    }


    @Test
    @Pending
    @Title("Verify Forgot your password link")
    public void clickForgetPasswordLink() {

        // Given
        navigate.toTheHomePage();

        // When
        loginPage.clickForgetPasswordLink();

        // Then
        Serenity.reportThat("Open Forget Password Page after clicking forget password link",
                () -> assertTrue(forgetPasswordPage.getHeadingForgetPasswordPage().equalsIgnoreCase("Reset Password")));

    }

}
