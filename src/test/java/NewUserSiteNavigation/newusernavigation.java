package NewUserSiteNavigation;

import Login.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class newusernavigation extends BaseTest {

    @Test(priority=1)
    public void logintoSite() throws InterruptedException {

        driver.findElement(By.id("input-31")).sendKeys("satya1@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span")).click();
        driver.findElement(By.id("input-39")).sendKeys("Ravi@123");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button[1]/span")).click();
        Thread.sleep(10000);


    }
    @Test(priority=2)
    public void checkDisplayName() throws InterruptedException {

       WebElement displayName= driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/header/div/button[2]/span/div/div[2]/span"));
       String name = displayName.getText();
       System.out.println(name);
       assertEquals(name,"Welcome, Satya");

    }
    @Test(priority=3)
    public void getNotifications() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/header/div/div[5]/button[1]/span/span/i")).click();
        Thread.sleep(6000);

    }
    @Test(priority=5)
    public void seeAllnotifications(){

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/a")).click();
        String titleofwindow = driver.getTitle();
        System.out.println(titleofwindow);
        assertEquals(titleofwindow,"Artemis Organizer - Notification");

    }
    @Test(priority=6)
    public void redirectedURL(){

       String NotificationsURL =  driver.getCurrentUrl();
       System.out.println(NotificationsURL);
       assertEquals(NotificationsURL,"https://staging.artemis.im/notifications");
    }
    @Test(priority=7)
    public void titleofwindow(){

       String title = driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]")).getText();
       System.out.println(title);
       assertEquals(title,"Notification");
    }
    @Test(priority = 8)
    public void clickArtemisLogo() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/header/div/div[1]/div/div[3]")).click();
        Thread.sleep(8000);
    }

}
