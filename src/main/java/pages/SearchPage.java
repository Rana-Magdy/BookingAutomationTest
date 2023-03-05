package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
    private WebDriver driver;
    private By searchDropDown = By.id("ss");
    private By selectCountry = By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]");
    private By checkInDate = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[5]/span/span");
    private By checkOutDate = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[3]/td[7]/span/span");
    private By searchBtn = By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSearchDropDown(){
       driver.findElement(searchDropDown).click();
       driver.findElement(selectCountry).click();
    }

    public void selectCheckInOutDates(){
        driver.findElement(checkInDate).click();
        driver.findElement(checkOutDate).click();
    }

    public ResultsPage submitOptionsSelected(){
        driver.findElement(searchBtn).click();
        return new ResultsPage(driver);

    }


}
