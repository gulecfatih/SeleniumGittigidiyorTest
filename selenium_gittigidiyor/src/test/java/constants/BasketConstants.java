package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketConstants extends BaseMethod {
    public BasketConstants(WebDriver driver) {
        super(driver);
    }

    public By DELETE = By.className("btn-delete btn-update-item");
    public By CHECKEMPTYBASKET =By.className("gg-w-22 gg-d-22 gg-t-21 gg-m-18");
}
