package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public HomePage homePage;
    public LoginPage loginPage;
    public ExcelReader excelReader;
    public String homepageURL;
    public SignOutPage signOutPage;


    @BeforeClass
    public void setUp() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, webDriverWait);
        loginPage = new LoginPage(driver, webDriverWait);
        excelReader = new ExcelReader("C:\\Users\\hp\\Desktop\\TestData.xlsx");
        homepageURL = excelReader.getStringData("Login", 1, 4);
        signOutPage=new SignOutPage(driver,webDriverWait);

    }

    public void visibilityWait(WebElement element) {

        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
