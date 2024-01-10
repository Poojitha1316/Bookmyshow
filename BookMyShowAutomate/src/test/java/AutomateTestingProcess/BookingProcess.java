package AutomateTestingProcess;

import BaseTest.BaseTestClass;
import PageObjects.HomePage;
import PageObjects.RecommendedMoviesForCityPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingProcess extends BaseTestClass {

    @BeforeMethod
    public void login() throws Exception {
        openBrowserAndNavigate();
    }
    @Test
    public void BookingTickets() {
        HomePage home = new HomePage();
        home.selectLocation();
        RecommendedMoviesForCityPage city = new RecommendedMoviesForCityPage();
        city.selectMovie();
    }
}
