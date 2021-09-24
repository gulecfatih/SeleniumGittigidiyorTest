package page;

import constants.SearchConstants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchPage extends SearchConstants {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage secondPage(){
        scrollElementBy(SECONDPAGE);
        getElementBy(SECONDPAGE).click();
        Assert.assertTrue("2. sayfa gorulmedi", driver.findElement(CHECKSECONDPAGE).isDisplayed());

        return this;
    }

    public SearchPage selectRandomProduct(){

        List<WebElement> productElems = driver.findElements(PRODUCT);
        int maxProducts = productElems.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();

        return this;

    }

    public BasketPage addBasket() {
        String product_price = driver.findElement(PRICETEXT).getText();
        getElementBy(ADDBASKET).click();
        getElementBy(GOBASKET).click();
        String basket_price = driver.findElement(BASKETPRICE).getText();
        if(product_price.equalsIgnoreCase(basket_price))
            System.out.println("Urun fiyati urun sayfasindaki ile aynı");
        else
            System.out.println("Urun fiyati urun sayfasindaki ile aynı degil");

        return new BasketPage(driver);
    }
}
