package Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utils.Constants;

public class Login_Test extends BaseTest{

    @Test(priority=1, description = "Check the Login page title")
    public void Login_HomePage() {
        Reporter.log("Fetch the title of the page");
        String title = driver.getTitle();
        System.out.println("The title of Login page is " + title);
        Reporter.log("Verify the title of the page is Artemis Accounts Portal");
        Assert.assertEquals(title,"Artemis Accounts Portal");

    }

    @Test(priority=2, description="Verify Login to application with valid details")
    public void LogintoApp() throws InterruptedException {

        driver.findElement(By.id(LoginPage.email_locator)).sendKeys(Constants.username);
        Reporter.log("User ented the email id details succefully");
        logger.info("User entered the email id");
        driver.findElement(By.xpath(LoginPage.ClickLoginButton)).click();
        Reporter.log("User clicks Login button succefully");
        Thread.sleep(3000);
        driver.findElement(By.id(LoginPage.password_locator)).sendKeys(Constants.password);
        Reporter.log("User entered the passowrd succefully");
        Thread.sleep(3000);
        driver.findElement(By.xpath(LoginPage.ClicknextButton)).click();
        Reporter.log("User clicks the next button");

    }
    @Test(priority=3)
    public void Loginsuccesful(){
        Reporter.log("User able to login succefully");
        String homepagetitle = driver.getTitle();
        System.out.println(homepagetitle);
    }



}
