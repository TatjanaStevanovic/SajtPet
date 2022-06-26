package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {

    String validUsername="Tatjana84";
    String validPassword="Sombor2022NF";
    String invalidUsername="pogresan username";
    String invalidPassword="pogresan password";

    @BeforeMethod

    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to(homepageURL);

    }
    @Test
    public void successfulLogin() throws InterruptedException {

        String validUsername= excelReader.getStringData("Login",1,0);
        String validPassword= excelReader.getStringData("Login",1,1);
        String invalidUsername = "pogresan username";
        String invalidPassword = "pogresan password";

        homePage.clickOnSignInButton();
        loginPage.clickOnLoginButton();
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);

        scrollIntoView(loginPage.getLoginButton());
        loginPage.clickOnLoginButton();
        visibilityWait(signOutPage.getSignOutButton());
        signOutPage.clickOnSignOutButton();
        Assert.assertTrue(signOutPage.getSignOutButton().isDisplayed());


    }


    }

    




