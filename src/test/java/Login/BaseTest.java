package Login;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Constants;

import java.lang.reflect.Method;

public class BaseTest {

    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static WebDriver driver;
    public static ExtentTest logger;

    @BeforeTest
    public void BeforeTestMethod(){

        htmlReporter = new ExtentHtmlReporter("./ExtentReports//Automation Test.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Test");
        htmlReporter.config().setReportName("Automation Test");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

    }
    @AfterTest
    public void AfterTestMethod() {

        extent.flush();
    }
    @BeforeMethod
    public void BeforeMethod(Method testMethod){

        logger = extent.createTest(testMethod.getName());
    }

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
