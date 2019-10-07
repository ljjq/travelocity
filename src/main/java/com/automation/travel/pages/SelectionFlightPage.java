package com.automation.travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SelectionFlightPage extends BasePage{
    public SelectionFlightPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(css="button[data-test-id='select-button']")
    private List<WebElement> selectButtonArray;

    @FindBy(css="button[data-test-id='select-button']")
    private WebElement selectSingleButton;

    public void selectionFlightDestination(){
        getWait().until(ExpectedConditions.elementToBeClickable(selectSingleButton));
        System.out.print(selectButtonArray.size());
        selectButtonArray.size();
        //selectButtonArray.get(3).click();

    }


}
