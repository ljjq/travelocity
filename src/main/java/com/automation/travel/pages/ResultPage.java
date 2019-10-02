package com.automation.travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultPage extends BasePage{
    public ResultPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(id="sortDropdown")
    private WebElement sortDropdown;

    @FindBy(css="button[data-test-id='select-button']")
    private List<WebElement> selectButton;

    @FindBy(css="span[data-test-id='duration']")
    private List<WebElement> flightDuration;

    @FindBy(className="show-flight-details")
    private List<WebElement> flightDetailBaggageFee;

    @FindBy(id="feedbackLink")
    private WebElement feedbackLink;

    public String getSortTitle(){
        return sortDropdown.getText();
    }

    public int countFlightDuration(){
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
       // System.out.println(flightDuration.size());
       // System.out.println(selectButton.size());
        //System.out.println(flightDetailBaggageFee.size());

        return flightDuration.size();

    }

    public int countButtonDuration(){
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        return selectButton.size();

    }

    public int countflightDetailBaggageFee(){
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        return flightDetailBaggageFee.size();

    }


}
