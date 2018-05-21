package com.AutomationWipro.Models;

import com.AutomationWipro.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DayComponent extends PageObject {

    WebElement refElement;

    public DayComponent(WebDriver driver,WebElement ele){
        super(driver );
        refElement = ele;
    }

    public void ToggleDay()
    {
        refElement.click();
    }
    public String GetDay(){
        return refElement.findElement(By.className("name")).getText();
    }
    public String GetDate(){
        return refElement.findElement(By.className("date")).getText();
    }
    public boolean IsMinTempDisplayed(){
        return refElement.findElement(By.className("max")).isDisplayed();
    }
    public boolean IsMaxTempDisplayed(){
        return refElement.findElement(By.className("min")).isDisplayed();
    }
    public boolean IsWindSpeedDisplayed(){
        return refElement.findElement(By.className("speed")).isDisplayed();
    }
    public boolean IsWindDirectionDisplayed(){
        return refElement.findElement(By.className("arrow")).isDisplayed();
    }
    public boolean IsRainfallDisplayed(){
        return refElement.findElement(By.className("rainfall")).isDisplayed();
    }
}
