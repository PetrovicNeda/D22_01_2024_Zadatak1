package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement disappearingElementsButton;
    WebElement dynamicControlsButton;
    WebElement hoversButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDisappearingElementsButton() {
        return driver.findElement(By.linkText("Disappearing Elements"));
    }

    public WebElement getDynamicControlsButton() {
        return driver.findElement(By.linkText("Dynamic Controls"));
    }

    public WebElement getHoversButton() {
        return driver.findElement(By.linkText("Hovers"));
    }

    //---------------------------------------------
    public void clickOnDissapearingElementsButton() {
        getDisappearingElementsButton().click();
    }

    public void clickOnDynamicControlsButton() {
        getDynamicControlsButton().click();
    }

    public void clickOnHoversButton() {
        getHoversButton().click();
    }
}
