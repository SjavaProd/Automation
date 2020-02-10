package SelenStartTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumFirstTest {
    private WebDriver driver;
    private static ThreadLocal<WebDriver> DRIVER_CONTAINER = new ThreadLocal<>();

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        DRIVER_CONTAINER.set(driver);
    }

    public WebDriver getDriver() {
        return DRIVER_CONTAINER.get();
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
            DRIVER_CONTAINER.remove();
        }
    }
}
