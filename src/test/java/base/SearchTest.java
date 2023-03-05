package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest {
    private WebDriver driver;

    @Test(priority = 1)
    public void clickSearchDropDownTest() {
        searchPage.clickSearchDropDown();
        searchPage.selectCheckInOutDates();
        searchPage.submitOptionsSelected();
        resultsPage.PageScrollDown();
        resultsPage.clickSeeAvailabilityBtn();

        bookingDetailsPage.navigateToSecondTab();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        bookingDetailsPage.PageScrollDown();
        bookingDetailsPage.selectRadioBtn();
        bookingDetailsPage.clickWillReserveBtn();
    }



}
