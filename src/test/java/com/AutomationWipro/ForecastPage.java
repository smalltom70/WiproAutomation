package com.AutomationWipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URL;

public class ForecastPage extends PageObject{

    private String URL;
    @FindBy(id="firstname")
    private WebElement firstName;

   // @FindBy(css = "#padding-bottom")
    //private WebElement tuesdayScope;

    @FindBy(css ="div[style='padding-bottom']")
    public WebElement tuesdayScope;

    @FindBy(className ="summary")
    public WebElement tuesday;

    public ForecastPage(WebDriver driver){
        super(driver );
        URL  = "https://weather-acceptance.herokuapp.com/";
    }

    public String getURL(){
        return URL;
    }

}
