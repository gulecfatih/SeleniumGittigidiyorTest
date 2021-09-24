package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginConstants extends BaseMethod {

    public LoginConstants(WebDriver driver) {
        super(driver);
    }

    public By SEARCHINPUT = By.cssSelector("input[name='k']");
    public By FIND = By.cssSelector("[type='submit']");




}
