package Forms;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageobjects.FormsPage;
import pageobjects.ProjectsPage;

import static org.testng.Assert.assertEquals;

public class FormsProperties extends BaseTest {

    Login_Test login = new Login_Test();
    @Test(priority=1)
    public void NavigatetoProjectDetailsPage() throws InterruptedException {

        login.LogintoApp();
        Thread.sleep(8000);
        driver.findElement(By.xpath(ProjectsPage.project_title)).click();
        Thread.sleep(7000);
    }
    @Test(priority = 2)
    public void NavigatetoFormsTab(){

        driver.findElement(By.xpath(FormsPage.formstab)).click();
        String url = driver.getCurrentUrl();
        System.out.println("The redirected url of forms is " + " " + url);
    }
    @Test(priority = 3)
    public void formspagetitle(){

      String formstitle=  driver.findElement(By.xpath(FormsPage.formstitle)).getText();
      System.out.println(formstitle);
      assertEquals(formstitle,"Forms");
    }
    @Test(priority = 4)
    public void createforms() throws InterruptedException {

        driver.findElement(By.xpath(FormsPage.formscreate)).click();
        Thread.sleep(8000);
    }
    @Test(priority = 5)
    public void redirectedurl(){

        String url_formscreate = driver.getCurrentUrl();
        System.out.println(url_formscreate);
    }
    @Test(priority = 6)
    public void formstitle(){

        String title = driver.findElement(By.xpath(FormsPage.formcreatepage_title)).getText();
        System.out.println("Forms created page title is " + title);


    }
    @Test(priority = 7)
    public void formtitle() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div/input")).clear();


    }
    @Test(priority = 8)
    public void createQuestion1() throws InterruptedException {


       driver.findElement(By.xpath("//div[@id='elk']/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/span/div/div/form/div/div/div[2]/div/div/div/div/div/input")).sendKeys("BabuGaru");
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/span/div/div/form/div/div[4]/div/div[2]/button/span")).click();



    }

    @Test(priority = 9)
    public void PublishForm() throws InterruptedException {

        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/button/span")).click();

    }


}
