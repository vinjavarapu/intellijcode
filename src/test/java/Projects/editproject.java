package Projects;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.ProjectsPage;
import utils.Constants;

import static org.testng.Assert.assertEquals;

public class editproject extends BaseTest {

    Login_Test login = new Login_Test();
    @Test(priority=1)
    public void NavigatetoProjectBoard() throws InterruptedException {

        driver.findElement(By.id(LoginPage.email_locator)).sendKeys(Constants.username1);
        Reporter.log("User ented the email id details succefully");
        logger.info("User entered the email id");
        driver.findElement(By.xpath(LoginPage.ClickLoginButton)).click();
        Reporter.log("User clicks Login button succefully");
        Thread.sleep(3000);
        driver.findElement(By.id(LoginPage.password_locator)).sendKeys(Constants.password1);
        Reporter.log("User entered the passowrd succefully");
        Thread.sleep(3000);
        driver.findElement(By.xpath(LoginPage.ClicknextButton)).click();
        Reporter.log("User clicks the next button");
        Thread.sleep(8000);
        String text = driver.findElement(By.xpath(ProjectsPage.project_title)).getText();
        System.out.println(text);
       // assertEquals(text,"Project123");

    }
    @Test(priority = 2)
    public void fetchProjectaccess(){

        String access = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[2]/span/span")).getText();
        System.out.println("The project current access policy is "+ " "+ access);
        assertEquals(access,"Public");
    }
    @Test(priority=3)
    public void checkProjectState() throws InterruptedException {

        String proj_state = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[3]/span/span")).getText();
        System.out.println("The project state is " + proj_state);
        assertEquals(proj_state,"Published");
        Thread.sleep(5000);
    }
    @Test(priority = 4)
    public void clickProjectHamburgicon() throws InterruptedException {

       driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/button")).click();
        Thread.sleep(8000);


    }
    @Test(priority = 5)
    public void ClickEditProject() throws InterruptedException {

       driver.switchTo().activeElement().findElement(By.xpath("/html/body/div/div[3]/div/div[1]/div")).click();
       Thread.sleep(8000);

    }
    @Test(priority=6)
    public void VerifyTitleofeditproject() throws InterruptedException {

       String title= driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[1]/div/div")).getText();
       System.out.println("The title of pop up is " + " "+ title);
       assertEquals(title,"Edit Project");
       Thread.sleep(6000);
    }

    @Test(priority = 7)
    public void edittitleofproject() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[1]/div/input")).clear();
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[1]/div/input")).sendKeys("Project123");
        Thread.sleep(6000);
    }
    @Test(priority = 8)
    public void clickCancelButton() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/button[1]/span")).click();
        Thread.sleep(8000);
    }


}
