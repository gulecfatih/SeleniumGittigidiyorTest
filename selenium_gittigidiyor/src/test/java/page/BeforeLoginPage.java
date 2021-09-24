package page;

import constants.BeforeLoginConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginPage extends BeforeLoginConstants {
    public BeforeLoginPage(WebDriver driver) {
        super(driver);
    }

    public BeforeLoginPage clickLogin() {

        getElementBy(NAVBARLOGIN).click();
        getElementBy(By.linkText(LOGIN)).click();

        return this;
    }

    public LoginPage successLogin(){

        getElementBy(EMAIL).sendKeys("gulec8062@gmail.com");
        getElementBy(PASSWORD).sendKeys("fatih.12345");
        getElementBy(SUBMIT).click();
        Assert.assertTrue("Hesabim gorulmedi", driver.findElements(MYACCOUNT).get(0).isDisplayed());
        return new LoginPage(driver);
    }

}
