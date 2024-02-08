package Base;

import Pages.DisappearingElementsPage;
import Pages.DynamicControlsPage;
import Pages.HomePage;
import Pages.HoversPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public DisappearingElementsPage disappearingElementsPage;
    public DynamicControlsPage dynamicControlsPage;
    public HoversPage hoversPage;
    public Actions action;
    public WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        disappearingElementsPage = new DisappearingElementsPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        hoversPage = new HoversPage(driver);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
