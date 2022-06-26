package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    WebElement SignInButton;
    WebElement FishButton;


    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }



    public WebDriver getDriver() {

        return driver;
    }

    public WebDriverWait getWdwait() {

        return wait;
    }
    //----------------------------------------------------------------------


    public WebElement getSignInButton() {

        return driver.findElement(By.id("MenuContent"));
    }

    public WebElement getFishButton() {

        return driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));

    }
    //------------------------------------------------------------------
    public void clickOnSignInButton(){

        this.getSignInButton().click();
    }
    public void clickOnFishButton(){
        this.getFishButton().click();
    }
}

