package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOutPage {

    WebDriver driver;
    WebDriverWait webDriverWait;
    WebElement signOutButton;

    public SignOutPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getSignOutButton() {
        return driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
    }
    //----------------------------------------------------------
    public void clickOnSignOutButton(){
        this.getSignOutButton().click();
    }
}
