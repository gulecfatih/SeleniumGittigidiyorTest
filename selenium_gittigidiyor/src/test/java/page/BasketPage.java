package page;

import constants.BasketConstants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasketConstants {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage deleteProduct(){
        getElementBy(DELETE).click();
        Assert.assertTrue("Urun silinmedi", driver.findElement(CHECKEMPTYBASKET).getText().equals("Sepetinizde ürün bulunmamaktadır."));

        return this;


    }
}
