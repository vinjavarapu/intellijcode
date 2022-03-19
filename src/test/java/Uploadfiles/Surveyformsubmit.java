package Uploadfiles;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Surveyformsubmit extends BaseTest {





        @Test
        public void testFileupload() throws Exception {
            driver.get("https://staging.artemis.im/surveys/afe7d69a-2149-44db-bb1d-d0396ec6020b");
           WebElement ele =  driver.findElement(By.xpath("//div[@id='elk']/div/main/div/div/div[2]/div/div[2]/div/div[2]/form/div/section/span/span"));
            Thread.sleep(7000);
          //  driver.findElement(By.xpath("//input")).clear();
            ele.sendKeys("C:\\Users\\vaamse\\Downloads\\PANCARD.pdf");
        }

    }

