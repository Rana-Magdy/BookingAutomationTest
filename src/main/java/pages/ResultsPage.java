package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    private WebDriver driver;
    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }
    private By clickAvailabilityBtn = By.cssSelector("#search_results_table > div:nth-child(2) > div > div > div > div.d4924c9e74 > div:nth-child(14) > div.d20f4628d0 > div.b978843432 > div > div.d7449d770c.a081c98c6f > div.e41894cca1 > div > div.a68bfa09c2 > a");


    public void PageScrollDown(){
        driver.manage().window().fullscreen();
        //driver.findElement(addApptPopUp).sendKeys(Keys.CONTROL, Keys.END);
      /*  WebElement element = driver.findElement(addApptPopUp);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("window.scrollBy(0,1700)", "");
    }

    public BookingDetailsPage clickSeeAvailabilityBtn(){
        driver.findElement(clickAvailabilityBtn).click();
        return new BookingDetailsPage(driver);
    }


}
