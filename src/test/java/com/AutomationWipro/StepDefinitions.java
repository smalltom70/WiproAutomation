package com.AutomationWipro;

import com.AutomationWipro.DefaultTest;
import com.AutomationWipro.ForecastPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;


public class StepDefinitions extends DefaultTest {

    ForecastPage forecastPage = new ForecastPage(driver);

    @Given("^I am on the Forecasts page$")
    public void iAmOnTheForecastsPage() {

        forecastPage.GotoPage();
    }


    @Then("^Tuesday scope is displayed$")
    public void tuesdayScopeIsDisplayed() {

        assertTrue(forecastPage.tuesdayScope.isDisplayed());

    }
}
