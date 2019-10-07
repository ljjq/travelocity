package com.automation.travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultPage extends BasePage {
    public ResultPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(css = "select[data-test-id='sortDropdown']")
    private WebElement sortDropdown;

    @FindBy(css = "option[data-opt-id='sort-PRICE_INCREASING']")
    private WebElement sortLowestPrice;


    @FindBy(css = "button[data-test-id='select-button']")
    private List<WebElement> selectButtonArray;

    @FindBy(css = "button[data-test-id='select-button']")
    private WebElement selectSingleButton;

    @FindBy(css = "span[data-test-id='duration']")
    private List<WebElement> flightDuration;

    @FindBy(className = "show-flight-details")
    private List<WebElement> flightDetailBaggageFee;

    @FindBy(className = "show-flight-details")
    private WebElement flightDetailBaggageFeeS;

    @FindBy(id = "feedbackLink")
    private WebElement feedbackLink;


    public String getSortTitle() {
        return sortDropdown.getText();
    }

    public int countFlightDuration() {
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        // System.out.println(flightDuration.size());
        // System.out.println(selectButton.size());
        //System.out.println(flightDetailBaggageFee.size());

        return flightDuration.size();

    }

    public int countButtonDuration() {
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        return selectButtonArray.size();

    }

    public int countflightDetailBaggageFee() {
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        return flightDetailBaggageFee.size();

    }

    public String selectionFlightPage() {
        getWait().until(ExpectedConditions.elementToBeClickable(feedbackLink));
        sortLowestPrice.click();
        return sortLowestPrice.getText();
    }

    public void chooseFlightOriginDestination() {
        flightDetailBaggageFeeS.click();
        selectSingleButton.click();

        getWait().until(ExpectedConditions.elementToBeClickable(selectSingleButton));
        flightDetailBaggageFeeS.click();
        selectSingleButton.click();

        //System.out.println(selectButtonArray.get(0).getText());
        //getWait().until(ExpectedConditions.elementToBeClickable(selectSingleButton));
        //flightDetailBaggageFee.get(3).getText();
        //selectSingleButton.click();
        //System.out.println(flightDetailBaggageFee.get(2).getText());
        //selectButtonArray.get(3).getText();
        //System.out.println(selectButtonArray.get(2).getText());
        //getWait().until(ExpectedConditions.visibilityOfAllElements(selectButtonArray));


    }


    /*
    public SelectionFlightPage chooseFlightOrigin(){
        getWait().until(ExpectedConditions.elementToBeClickable(selectSingleButton));
        selectButtonArray.get(0).click();
        selectSingleButton.click();

        return new SelectionFlightPage(getDriver());
    }
*/

}
