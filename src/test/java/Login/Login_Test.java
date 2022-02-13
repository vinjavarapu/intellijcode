package Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends BaseTest{

    @Test(priority=1, description = "Check the Login page title")
    public void Login_HomePage() {

        String title = driver.getTitle();
        System.out.println("The title of Login page is " + title);
        Assert.assertEquals(title,"Artemis Accounts Portal");

    }
    @Test(priority=2, description="Verify Login to application with valid details")
    public void LogintoApp() throws InterruptedException {

        driver.findElement(By.id("input-31")).sendKeys("vinjavarapu@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("input-39")).sendKeys("Ravi@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button[1]/span")).click();
    }
    @Test(priority=3)
    public void Loginsuccesful(){

        String homepagetitle = driver.getTitle();
        System.out.println(homepagetitle);
    }



}
