package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {


    public static WebDriver driver;
    final static String baseurl = "https://accounts.staging.artemis.im/?origin=organizer";
    @BeforeClass
    public void LaunchArtemisURL() {
        System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void QuitWindows() {

        driver.quit();
    }


}
