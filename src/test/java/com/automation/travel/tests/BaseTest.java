package com.automation.travel.tests;
import com.automation.travel.pages.MyDriver;
import com.automation.travel.pages.TravelHomePage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    MyDriver myDriver;
    private TravelHomePage travelHome;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})

    public void beforeSuite(String browser){
        myDriver = new MyDriver(browser);
        travelHome = new TravelHomePage(myDriver.getDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        travelHome.dispose();
    }

    public TravelHomePage getTravelHomePage(){
        return travelHome;
    }
}

