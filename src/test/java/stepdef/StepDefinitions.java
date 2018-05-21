package stepdef;

import com.AutomationWipro.Models.DayComponent;
import com.AutomationWipro.Models.ForecastPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    protected static WebDriver driver;

    ForecastPage forecastPage = new ForecastPage(driver);

    @Given("^I am on the forecast page$")
    public void iAmOnTheForecastsPage() {

        driver.get(forecastPage.getURL());
    }

    @Then("^Tuesday scope is displayed$")
    public void tuesdayScopeIsDisplayed() {

        forecastPage.tuesday.click();

        DayComponent a3 = forecastPage.GetDayComponent(3);

        a3.ToggleDay();
    }


    @Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
         forecastPage = new ForecastPage(driver);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){

        driver.close();
    }

    @Then("^a 5 day forecast will be displayed$")
    public void aDayForecastWillBeDisplayed() {
        //Wanted to show type of assertion done.  If given more time this would be dynamic and would check full forecast
        // displayed over entire week.
        DayComponent firstDay = forecastPage.GetDayComponent(0);

        Assert.assertEquals(firstDay.GetDate(), "20");
        Assert.assertEquals(firstDay.GetDay(), "Tue");
        Assert.assertTrue(firstDay.IsMaxTempDisplayed());
        Assert.assertTrue(firstDay.IsMinTempDisplayed());
        Assert.assertTrue(firstDay.IsWindDirectionDisplayed());
        Assert.assertTrue(firstDay.IsWindSpeedDisplayed());
        Assert.assertTrue(firstDay.IsRainfallDisplayed());

    }

    @When("^I enter the city name \"([^\"]*)\"$")
    public void iEnterTheCityName(String cityName) {
        forecastPage.EnterCityInput(cityName);
    }

    @Then("^a error message is displayed$")
    public void aErrorMessageIsDisplayed()  {
        Assert.assertEquals( "Error retrieving the forecast", forecastPage.GetError());
    }
}
