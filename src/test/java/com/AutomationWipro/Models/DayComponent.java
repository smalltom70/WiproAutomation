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
   // WebElement dayRowScope = refElement.findElement(By.className("Summary"));
    //List<WebElement> timeRowScope = refElement.findElements(By.className("detail"));

    public void ToggleDay()
    {
        refElement.click();
    }


}
