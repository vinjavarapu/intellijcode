package Forms;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.ProjectsPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class CreateForms extends BaseTest {

    Login_Test login = new Login_Test();
    @Test(priority = 1)
    public void logintoApp1() throws InterruptedException {

        login.LogintoApp();
        Thread.sleep(8000);


    }
    @Test(priority = 2)
    public void launchFormsURL() throws InterruptedException {

        driver.get("https://staging.artemis.im/projects/58077123-0bb9-4013-b6e1-233a86b79fa9#surveys");
        Thread.sleep(6000);


    }
    @Test(priority = 3)
    public void fetchtheformspagetitle(){

          WebElement forms_title =  driver.findElement(By.className("strategy-title"));
          String title = forms_title.getText();
          System.out.println(title);
          assertEquals(title,"Forms");




    }
    @Test(priority = 4)
    public void SearchForms_InvalidData() throws InterruptedException {


        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[2]/div/div/div/div/div[2]/input")).sendKeys("Basara");
        assertEquals(driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[4]/div/span")).getText(), "No results found");
        Thread.sleep(4000);
    }
    @Test(priority = 5)
    public void SearchForms_validData() throws InterruptedException {

        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[2]/div/div/div/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[2]/div/div/div/div/div[2]/input")).sendKeys("Ravi");
        Thread.sleep(4000);
    }
    @Test(priority = 6)
    public void clickFormslistview(){

       driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[2]/div[2]/div/div[2]/button")).click();
    }
    @Test(priority = 7)
    public void ClearSearchDatainForm() {

        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[2]/div/div/div/div/div[2]/input")).clear();

    }
    @Test(priority = 8)
    public void FormsListView_TH_SerialNumber() {

        String text = driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[3]/div/div/div/table/thead/tr/th[1]")).getText();
        System.out.println(text);
        assertEquals(text,"#");
    }
    @Test(priority = 9)
    public void FormsListView_TH_Name() {

        String text = driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[3]/div/div/div/table/thead/tr/th[2]")).getText();
        System.out.println(text);
        assertEquals(text,"Name");
    }
    @Test(priority = 10)
    public void FormsListView_TH_CreatedAT() {

        String text = driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[3]/div/div/div/table/thead/tr/th[3]")).getText();
        System.out.println(text);
        assertEquals(text,"Created At");
    }
    @Test(priority = 11)
    public void FormsListView_TH_Status() {

        String text = driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[3]/div/div/div/table/thead/tr/th[4]")).getText();
        System.out.println(text);
        assertEquals(text,"Status");
    }
    @Test(priority = 12)
    public void FormsListView_TH_Actions() {

        String text = driver.findElement(By.xpath("//*[@id=\"surveys\"]/div/div/div[3]/div/div/div/table/thead/tr/th[5]")).getText();
        System.out.println(text);
        assertEquals(text,"Actions");
    }
    @Test(priority = 13)
    public void SortNameForms_AscOrder() throws InterruptedException {

       driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[2]/div/div/span")).click();
       Thread.sleep(4000);
    }
    @Test(priority = 14)
    public void SortNameForms_DscOrder() throws InterruptedException {

        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[2]/div/div/span")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 15)
    public void SortCreatedAt_AscOrder() throws InterruptedException {


        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[3]/div/div/span")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 16)
    public void SortCreatedAt_DscOrder() throws InterruptedException {


        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[3]/div/div/span")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 17)
    public void SortStatus_AscOrder() throws InterruptedException {

        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[4]/div/div/span")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 18)
    public void SortStatus_DscOrder() throws InterruptedException {

        driver.findElement(By.xpath("//div[@id='surveys']/div/div/div[3]/div/div/div/table/thead/tr/th[4]/div/div/span")).click();
        Thread.sleep(4000);
    }


}
