package Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utils.Constants;

public class Login_Test extends BaseTest{

    @Test(priority=1, description = "Check the Login page title")
    public void Login_HomePage() {

        String title = driver.getTitle();
        System.out.println("The title of Login page is " + title);
        Assert.assertEquals(title,"Artemis Accounts Portal");

    }

    @Test(priority=2, description="Verify Login to application with valid details")
    public void LogintoApp() throws InterruptedException {

        driver.findElement(By.id(LoginPage.email_locator)).sendKeys(Constants.username);
        driver.findElement(By.xpath(LoginPage.LoginButton)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(LoginPage.password_locator)).sendKeys(Constants.password);
        Thread.sleep(3000);
        driver.findElement(By.xpath(LoginPage.nextButton)).click();
    }
    @Test(priority=3)
    public void Loginsuccesful(){

        String homepagetitle = driver.getTitle();
        System.out.println(homepagetitle);
    }



}
