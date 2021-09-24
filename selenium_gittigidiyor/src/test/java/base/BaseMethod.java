package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseMethod {

    protected WebDriver driver;

    public BaseMethod(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementBy(By by) {
        return driver.findElement(by);
    }
    public WebElement scrollElementBy(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }
}
