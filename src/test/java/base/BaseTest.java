package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BookingDetailsPage;
import pages.ResultsPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    public SearchPage searchPage;
    public ResultsPage resultsPage;
    public BookingDetailsPage bookingDetailsPage;

   /* @BeforeClass
    public void Setupp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }*/

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.booking.com/");
        driver.manage().window().fullscreen();
        searchPage = new SearchPage(driver);
        resultsPage = new ResultsPage(driver);
        bookingDetailsPage = new BookingDetailsPage(driver);

    }

  /*  @AfterClass
    public void TearDown(){
        driver.quit();
    }*/


}
