package com.AutomationWipro.Models;

import com.AutomationWipro.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ForecastPage extends PageObject {

    private String URL;
    @FindBy(id="firstname")
    private WebElement firstName;

    @FindBy(css = "div[data-test=\"error\"]")
    private WebElement errorMessage;

    @FindBy(css ="div[style='padding-bottom: 20px;']")
    private List<WebElement> DayComponentScopes;

    @FindBy(id = "city")
    private WebElement cityInput;

    public ForecastPage(WebDriver driver){
        super(driver );
        URL  = "https://weather-acceptance.herokuapp.com/";
    }

    public String getURL(){
        return URL;
    }

    public DayComponent GetDayComponent(int dayNum){
        return new DayComponent(driver,DayComponentScopes.get(dayNum));
    }

    public void EnterCityInput(String cityName){
        cityInput.clear();
        cityInput.sendKeys(cityName);
        cityInput.sendKeys(Keys.ENTER);
    }

    public String GetError() {
        return errorMessage.getText();
    }

}
