package Onboardingnewclient;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingupNewUser {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchURL() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.staging.artemis.im/?origin=organizer");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void quitwindows() {
		
		driver.quit();
	}
	
	@Test(description="Verify user able to see signup link",priority=1)
	public void VerifySignupLinkisavailable() {
		
	WebElement signup_link=	driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[3]/div[4]/a"));
	boolean isSignuppresent = signup_link.isDisplayed();
	System.out.println(isSignuppresent);
	assertEquals(isSignuppresent, true);
	if(isSignuppresent==true) {
		
		System.out.println("Signup link is present in Login screen");
		
	}
	boolean Signup_enabled = signup_link.isEnabled();
	assertEquals(Signup_enabled, true);
	if(Signup_enabled==true) {
		
		System.out.println("Signup link is enabled");
	}
	
		
		
		
	}
	@Test(description = "Verify User clicks the signuplink",priority=2)
	public void clickSignuplink() {
		
		WebElement signup_link=	driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[3]/div[4]/a"));
		signup_link.click();
		
		
		
	}
	@Test(description="user navigated to Signup screen",priority=3)
	public void verifyTitleofsignup()
	{
		WebElement signup_label = driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[3]/div[1]/div"));
		String label = signup_label.getText();
		System.out.println("The label of signup is " + label);
		assertEquals(label, "Sign up");
		
		
	}
}
		
		
		
		
	


