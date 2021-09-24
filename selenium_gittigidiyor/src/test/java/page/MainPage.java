package page;

import constants.MainConstants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPage extends MainConstants {
    public MainPage(WebDriver driver) {
        super(driver);
    }


    public SearchPage secondPage(){
        scrollElementBy(SECONDPAGE);
        getElementBy(SECONDPAGE).click();
        Assert.assertTrue("2. sayfa gorulmedi", driver.findElement(CHECKSECONDPAGE).isDisplayed());

        return new SearchPage(driver);
    }



}
