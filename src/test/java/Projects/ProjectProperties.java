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
        assertEquals(redirected_url,"https://staging.artemis.im/projects");

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

}
