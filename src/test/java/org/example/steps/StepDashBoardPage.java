package org.example.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StepDashBoardPage extends PageObject {

    @FindBy(xpath = "//*[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElementFacade dashboardPageTitle;

    @Step("Heading of DashBoard Page")
    public String getHeading() {
        return dashboardPageTitle.getText();


    }
}