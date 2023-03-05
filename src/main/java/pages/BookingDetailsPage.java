package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class BookingDetailsPage {
    private WebDriver driver;
    public BookingDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    private By selectBedAndAmount = By.xpath("//*[@id=\"hprt-table\"]/tbody/tr[1]/td[1]/div/div[3]/div/label[2]/ul/li/span");
    private By reserveBtn = By.id("b_tt_holder_2");

    public void navigateToSecondTab() {
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "4");
        /*driver.get("https://www.booking.com/hotel/eg/royal-tulip-alexandria.html?aid=304142&label=gen173nr" +
                "-1FCAEoggI46AdIM1gEaEOIAQGYATG4ARfIAQzYAQHoAQH4AQKIAgGoAgO4Arqhlp0GwAIB0gIkZTQ4MzZiNmU" +
                "tMzNlOS00MTdmLTkzNjQtOTIwM2M2OGY1OTc32AIF4AIB&sid=390007f51ed0156ca468753ca76bf465&all_sr_blocks" +
                "=78883120_91939502_0_33_0;checkin=2022-12-30;checkout=2023-01-15;dest_id=-290263;dest_type=city;" +
                "dist=0;group_adults=2;group_children=0;hapos=7;highlighted_blocks=78883120_91939502_0_33_0;" +
                "hpos=7;matching_block_id=78883120_91939502_0_33_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=" +
                "popularity;sr_pri_blocks=78883120_91939502_0_33_0__125372;srepoch=1671801119;srpvid=8aa15cce79fd0179;type=total;ucfs=1&#hotelTmpl");*/
        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        while (it.hasNext()) {

            String child = it.next();

            driver.switchTo().window(child);
        }
    }
    public void PageScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
    }

    public void selectRadioBtn(){

        driver.findElement(selectBedAndAmount).click();
    }

    public void clickWillReserveBtn(){
        driver.findElement(reserveBtn).click();


    }


}
