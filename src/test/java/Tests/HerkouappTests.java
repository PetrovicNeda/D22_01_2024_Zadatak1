package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HerkouappTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test(priority = 10)
    public void userGoToHomePageAfterClickingHomeButtonInDisappearingElements() {
        homePage.clickOnDissapearingElementsButton();
        disappearingElementsPage.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/");
    }

    @Test(priority = 20)
    public void userCanUseRemoveButton() {
        homePage.clickOnDynamicControlsButton();
        dynamicControlsPage.clickOnRemoveAddButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
    }

    @Test(priority = 30)
    public void userCanUseAddButton() {
        homePage.clickOnDynamicControlsButton();
        dynamicControlsPage.clickOnRemoveAddButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
        dynamicControlsPage.clickOnRemoveAddButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertEquals(dynamicControlsPage.getMessage().getText(), "It's back!");
    }

    @Test(priority = 40)
    public void userCanUseEnableButton() {
        homePage.clickOnDynamicControlsButton();
        dynamicControlsPage.clickOnEnableButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertEquals(dynamicControlsPage.getMessage().getText(), "It's enabled!");
    }

    @Test(priority = 50)
    public void userCanUseDisableButton() {
        homePage.clickOnDynamicControlsButton();
        dynamicControlsPage.clickOnEnableButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertEquals(dynamicControlsPage.getMessage().getText(), "It's enabled!");

        dynamicControlsPage.clickOnEnableButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        Assert.assertEquals(dynamicControlsPage.getMessage().getText(), "It's disabled!");
    }

    @Test(priority = 60)
    public void whenUserHoverOverAppropriateUserNameIsDisplayed() {
        homePage.clickOnHoversButton();
        hoversPage.hoverOverElementsAndAssertThatExpecterNameIsDisplayed(action);
    }
}
