package com.automation.travel.tests;
import com.automation.travel.pages.ResultPage;
import com.automation.travel.pages.TravelHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TravelTest extends BaseTest {

        @Test
        public void testTravelBooking(){
            TravelHomePage home = getTravelHomePage();
            ResultPage resultPage = home.chooseTravelInformation(" LAS"," LAX");
            Assert.assertEquals(resultPage.getSortTitle(),"Price (Lowest)\n" +
                                                                   "Price (Highest)\n" +
                                                                   "Duration (Shortest)\n" +
                                                                   "Duration (Longest)\n" +
                                                                   "Departure (Earliest)\n" +
                                                                   "Departure (Latest)\n" +
                                                                   "Arrival (Earliest)\n" +
                                                                   "Arrival (Latest)");
            Assert.assertEquals(resultPage.countFlightDuration(),resultPage.countButtonDuration());
            Assert.assertEquals(resultPage.countFlightDuration(),resultPage.countflightDetailBaggageFee());
        }


}
