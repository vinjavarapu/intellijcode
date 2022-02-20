package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Constants;

import static org.testng.AssertJUnit.assertEquals;


public class LoginInvalidAndForgotPassword extends BaseTest {

    @Test
    public void EnterWrongemailid() throws InterruptedException {

        driver.findElement(By.id("input-31")).sendKeys("test");

        driver.findElement(By.xpath("//div[@id='0']/div/div[3]")).click();

        driver.findElement(By.xpath("//div[@id='fawn-accounts']/div/main/div/div/div/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        Thread.sleep(5000);
        assertEquals(driver.switchTo().activeElement().findElement(By.xpath("//div[@id='fawn-accounts']/div/div/div/div/div/div/div[2]/pre")).getText(), "Please enter valid email address");



    }
    @Test
    public void wrongpassword() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.id("input-31")).sendKeys("vinjavarapu@gmail.com");
        driver.findElement(By.xpath("//div[@id='fawn-accounts']/div/main/div/div/div/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        driver.findElement(By.xpath("//div[@id='fawn-accounts']/div/main/div/div/div/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='fawn-accounts']/div/div/div/div/div/div/div[2]/pre")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='fawn-accounts']/div/div/div/div/div/div/div[2]/pre")).getText(), "Password is required");
    }
    @Test(priority=1)
    public void LaunchURL(){

        driver.get(Constants.url);
        driver.manage().window().maximize();
    }
    @Test(priority=2)
    public void checklabelsinLoginPage(){

        String title = driver.getTitle();
        System.out.println(title);
    }
    @Test(priority=3)
    public void navigatetoforgotpasswordpage() throws InterruptedException {

        driver.findElement(By.id("input-31")).sendKeys("vinjavarapu@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        Thread.sleep(4000);


    }
    @Test(priority = 4)
    public void CheckForgotpasswordlink_exists(){

        WebElement forgotpassword = driver.findElement(By.xpath("//*[@id=\"1\"]/div[3]/a"));
        String label = forgotpassword.getText();
        System.out.println("The forgotpassword link displayed as " + " "+ label);
        assertEquals(label,"Forgot Password?");
    }
    @Test(priority=5)
    public void ClickForgotpasswordlink() throws InterruptedException {

        WebElement forgotpassword = driver.findElement(By.xpath("//*[@id=\"1\"]/div[3]/a"));
        forgotpassword.click();
        Thread.sleep(6000);
    }
    @Test(priority = 6)
    public void userinputemail() throws InterruptedException {

        driver.findElement(By.id("input-58")).sendKeys("vinjavarapu@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div/button[1]/span")).click();
    }
    @Test(priority=7)
    public void recoveryhelptext(){

        String helptext= driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]")).getText();
        System.out.println(helptext);


    }
    @Test(priority=8)
    public void clickcontinuelogin() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div/button/span")).click();
    }
}
