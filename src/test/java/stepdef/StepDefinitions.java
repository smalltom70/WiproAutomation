package stepdef;

import com.AutomationWipro.Models.DayComponent;
import com.AutomationWipro.Models.ForecastPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    protected static WebDriver driver;

    ForecastPage forecastPage = new ForecastPage(driver);

    @Given("^I am on the Forecasts page$")
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
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @After
    public static void tearDown(){
        driver.close();
    }
}
