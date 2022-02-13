package Projects;



import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CreateProjects extends BaseTest {

    Login_Test login = new Login_Test();

    @Test(priority=1)
    public void NewCreateProject() throws InterruptedException {

        login.LogintoApp();
        Thread.sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[2]/button/span"))
        );

        element.click();

        Thread.sleep(5000);

        driver.findElement(By.id("input-216")).sendKeys("Ravikumar");
        driver.findElement(By.xpath("//*[@id=\"elk\"]/div[4]/div/div/div[3]/button[2]/span")).click();

    }
    @Test(priority=2)
    public void SearchProjectTitle() throws InterruptedException {
       Thread.sleep(4000);

        driver.findElement(By.id("input-191")).sendKeys("Test@1234");
        Thread.sleep(8000);
    }
    @Test(priority=3)
    public void project_label() throws InterruptedException {

          WebDriverWait wait = new WebDriverWait(driver,20);
          WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/div[1]")));
          String text = ele.getText();
          System.out.println("The label of project name displayed is " + text);

    }
    @Test(priority=4)
    public void project_accesspolicy() {

       String text= driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/div[2]/span/span")).getText();
       System.out.println("The project access policy is " + text );
    }

}
