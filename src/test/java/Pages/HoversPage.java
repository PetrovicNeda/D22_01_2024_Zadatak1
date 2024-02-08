package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class HoversPage {
    WebDriver driver;
    WebElement figures;

    WebElement usernames;


    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getFigures() {
        return driver.findElements(By.className("figure"));
    }

    public List<WebElement> getUsernames() {
        return driver.findElements(By.cssSelector(".figcaption"));
    }

    //----------------------------------------

    public void hoverOverElementsAndAssertThatExpecterNameIsDisplayed(Actions action) {
        for (int i = 0; i < getFigures().size(); i++) {
            action.moveToElement(getFigures().get(i)).perform();
            Assert.assertTrue(getUsernames().get(i).isDisplayed());
            Assert.assertTrue(getUsernames().get(i).getText().contains("name: user" + (i + 1)));
            System.out.println(getUsernames().get(i).getText());
        }
    }
}
