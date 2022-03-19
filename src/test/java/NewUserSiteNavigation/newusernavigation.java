package NewUserSiteNavigation;

import Login.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class newusernavigation extends BaseTest {

    @Test
    public void logintoSite() throws InterruptedException {

        driver.findElement(By.id("input-31")).sendKeys("satya1@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        driver.findElement(By.id("input-39")).sendKeys("Ravi@123");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button[1]/span")).click();
        Thread.sleep(10000);


    }
}
