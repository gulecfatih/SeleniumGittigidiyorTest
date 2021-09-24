package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchConstants extends BaseMethod {
    public SearchConstants(WebDriver driver) {
        super(driver);
    }

    public By SECONDPAGE = By.cssSelector("li:nth-of-type(3) > a[role='button'] > span");
    public By CHECKSECONDPAGE = By.className("sc-1o6eogh-0 i3yadh-0 gmgqoT sc-1n49x8z-9 jVhkOY");
    public By PRODUCT = By.className("sc-1nx8ums-0 chVxFF");
    public By PRICETEXT = By.id("sp-price-discountPrice");
    public By ADDBASKET = By.className("control-button gg-ui-button plr10 gg-ui-btn-default");
    public By GOBASKET = By.className("notify-user basket-item-count");
    public By BASKETPRICE = By.className("extra-discounted");


}
