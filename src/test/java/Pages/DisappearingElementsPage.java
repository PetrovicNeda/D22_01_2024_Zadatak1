package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPage {
    WebDriver driver;
    WebElement homeButton;

    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(By.linkText("Home"));
    }


    //-------------------------------------

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
}
