package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicControlsPage {
    WebDriver driver;
    WebElement removeAddButton;
    WebElement message;
    WebElement enableButton;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRemoveAddButton() {
        return driver.findElement(By.cssSelector("button[type='button']"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("message"));
    }

    public List<WebElement> getEnableButton() {
        return driver.findElements(By.cssSelector("button[type='button']"));
    }
//------------------------------------

    public void clickOnRemoveAddButton() {
        getRemoveAddButton().click();
    }

    public void clickOnEnableButton() {
        getEnableButton().get(1).click();
    }
}
