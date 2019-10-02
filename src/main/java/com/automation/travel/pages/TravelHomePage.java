package com.automation.travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TravelHomePage extends BasePage{
    public TravelHomePage(WebDriver driver){
        super(driver);
        driver.get("https://www.travelocity.com/");
    }

    @FindBy(id="tab-flight-tab-hp")
    private WebElement btnFlightsOption;

    @FindBy(id="flight-origin-hp-flight")
    private WebElement btnFlightOrigin;

    @FindBy(className="multiLineDisplay")
    private WebElement autocompleteFlight;

    @FindBy(id="flight-destination-hp-flight")
    private WebElement btnFlightDestination;

    @FindBy(id="flight-departing-hp-flight")
    private WebElement dateDeparting;

    @FindBy(css="button[class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
    private WebElement btnDatepickerDepartingNext;

    @FindBy(className="datepicker-cal-date")
    private WebElement dayDeparting;

    @FindBy(id="flight-returning-hp-flight")
    private WebElement dateReturning;

    @FindBy(css="button[class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
    private WebElement btnDatepickerReturningNext;

    @FindBy(css="button[data-gcw-change-submit-text='Search']")
    private WebElement btnSearch;

    public ResultPage chooseTravelInformation(String originFlight,String destinationFlight){

        btnFlightsOption.click();
        getWait().until(ExpectedConditions.elementToBeClickable(btnFlightOrigin));
        btnFlightOrigin.sendKeys(originFlight);
        getWait().until(ExpectedConditions.elementToBeClickable(autocompleteFlight));
        autocompleteFlight.click();
        getWait().until(ExpectedConditions.elementToBeClickable(btnFlightDestination));
        btnFlightDestination.sendKeys(destinationFlight);
        getWait().until(ExpectedConditions.elementToBeClickable(autocompleteFlight));
        autocompleteFlight.click();
        dateDeparting.click();
        btnDatepickerDepartingNext.click();
        btnDatepickerDepartingNext.click();
        btnDatepickerDepartingNext.click();
        dayDeparting.click();
        dateReturning.click();
        btnDatepickerReturningNext.click();
        btnDatepickerReturningNext.click();
        btnDatepickerReturningNext.click();
        btnDatepickerReturningNext.click();
        dayDeparting.click();
        btnSearch.click();

        return new ResultPage(getDriver());
    }

}
