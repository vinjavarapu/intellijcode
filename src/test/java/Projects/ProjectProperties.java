package Projects;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ProjectsPage;
import utils.Constants;

import static org.testng.Assert.assertEquals;

public class ProjectProperties extends BaseTest {

    Login_Test login = new Login_Test();
    @Test(priority=1)
    public void fetchprojecttitle() throws InterruptedException {

        login.LogintoApp();
        Thread.sleep(8000);
        String text = driver.findElement(By.xpath(ProjectsPage.project_title)).getText();
        System.out.println(text);
        assertEquals(text,"Project123");

    }
    @Test(priority=2)
    public void ClickProject() {

        driver.findElement(By.xpath(ProjectsPage.project_title)).click();
        String redirected_url = driver.getCurrentUrl();
        System.out.println(redirected_url);
       // assertEquals(redirected_url,"https://staging.artemis.im/projects");

    }
    @Test(priority=3)
    public void getProjectClassification() {

        WebElement element = driver.findElement(By.xpath(ProjectsPage.project_access));
        String access = element.getText();
        System.out.println("The project access is " + access);
    }
    @Test(priority=4)
    public void getProjectDetailsContent() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(ProjectsPage.project_seedetails));
        element.click();
        Thread.sleep(5000);
        WebElement description = driver.findElement(By.xpath(ProjectsPage.project_desc));
        String text = description.getText();
        System.out.println(text);


    }
    @Test(priority=5)
    public void closeProjectDetailsContent(){
        WebElement element = driver.findElement(By.xpath(ProjectsPage.project_closedetails));
        element.click();


    }
    @Test(priority=6)
    public void ClickStrategyTab(){

        WebElement element = driver.findElement(By.xpath(ProjectsPage.project_strategytab));
        element.click();
        String text = element.getText();
        System.out.println("The tab name is " + text );
        assertEquals(text,"Strategy");
    }
    @Test(priority=7)
    public void ClickCreateStragey() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(ProjectsPage.project_CreateStrategy));
        element.click();
        String tabName = element.getText();
        System.out.println("The tab name is " + tabName);
        Thread.sleep(5000);
    }
    @Test(priority=8)
    public void verifyCreateStrategypopupDetails(){

       WebElement ele = driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div/div/form/div/div/div/div"));
       String text = ele.getText();
       System.out.println(text);
       assertEquals(text,"Create strategy");
    }
    @Test(priority=9)
    public void VerifyHelpText(){

        WebElement HelpText = driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div/div/form/div/div/div[2]/div/span"));
        String HelpText_Content = HelpText.getText();
        System.out.println("The help text displayed as " + " " + HelpText_Content);

    }
    @Test(priority=10)
    public void TitleLabel_exists(){

        WebElement title_label = driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div/div/form/div/div[2]/div/div/div/div"));
        String text = title_label.getText();
        System.out.println(text);
    }
    @Test(priority=11)
    public void ProblemStatement_exists() {

        WebElement problemstatement = driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div/div/form/div/div[2]/div[2]/div/div/div"));
        String text = problemstatement.getText();
        System.out.println(text);
    }
    @Test(priority = 12)
    public void enterTitleofStrategy() throws InterruptedException {

        WebElement title = driver.switchTo().activeElement().findElement(By.id("input-362"));
        title.sendKeys("Ravikumar123");
        Thread.sleep(4000);
    }
    @Test(priority = 13)
    public void enterProblemStatements() throws InterruptedException {

       driver.switchTo().activeElement().findElement(By.xpath("//*[@id=\"input-364\"]")).sendKeys("text12345text12345text12345text12345text12345text12345text12345");

    }
    @Test(priority = 14)
    public void ClickCreateStargeyDoneButton() throws InterruptedException {

        driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div[2]/button[2]/span")).click();
        Thread.sleep(5000);


    }
    @Test(priority = 15)
    public void DeleteStargeyMenu() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"toc\"]/div[1]/div/div[1]/div[5]/button")).click();
        Thread.sleep(4000);


    }


    @Test(priority = 16)
    public void DeleteStragey() throws InterruptedException {

        driver.findElement(By.id("list-item-411")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 17)
    public void DeleteConfirmmessage(){

      String confirmmessge=  driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[5]/div/div/div/div/div")).getText();
      System.out.println(confirmmessge);
      assertEquals(confirmmessge,"Are you sure?");
    }
    @Test(priority = 18)
    public void Deleteaction(){

        driver.switchTo().activeElement().findElement(By.xpath("//div[@id='elk']/div[5]/div/div/div[3]/button[2]/span")).click();
    }



}
