package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Constants;

public class BaseTest {


    public static WebDriver driver;

    @BeforeClass
    public void LaunchArtemisURL() {
         Setupdriver();
        driver.get(Constants.url);
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void QuitWindows() {

        driver.quit();
    }

    public void Setupdriver() {
        System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
        driver = new ChromeDriver();

    }


}
