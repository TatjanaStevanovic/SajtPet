package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait webDriverWait;
    WebElement username;
    WebElement password;
    WebElement loginButton;




    public LoginPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getUsername() {

        return driver.findElement(By.name("username"));
    }

    public WebElement getPassword() {

        return driver.findElement(By.name("password"));
    }

    public WebElement getLoginButton() {

        return driver.findElement(By.name("signon"));
    }
    //------------------------------------------------------------------
    public void insertUsername(String username){
        //this.getUsername().clear();
        this.getUsername().sendKeys(username);
    }
    public void insertPassword(String password){
        this.getPassword().clear();
        this.getPassword().sendKeys(password);

    }
    public void clickOnLoginButton(){

        this.getLoginButton().click();
    }


    }



