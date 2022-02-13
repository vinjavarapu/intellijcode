package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class LoginInvalid extends BaseTest {

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
}
