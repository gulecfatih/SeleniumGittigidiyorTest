package constants;

import base.BaseMethod;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginConstants extends BaseMethod {
    public BeforeLoginConstants(WebDriver driver) {
        super(driver);
    }

    public By NAVBARLOGIN = By.cssSelector("div > div[title='Giriş Yap']");
    public String LOGIN ="Giriş Yap";

    public By EMAIL = By.id("L-UserNameField");
    public By PASSWORD = By.id("L-PasswordField");
    public By SUBMIT = By.cssSelector("input#gg-login-enter");
    public By MYACCOUNT = By.className("gekhq4-4 egoSnI"); //index 0
}
