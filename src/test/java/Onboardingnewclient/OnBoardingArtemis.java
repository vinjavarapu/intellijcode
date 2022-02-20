package Onboardingnewclient;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utils.Constants;


public class OnBoardingArtemis {
	
	public WebDriver driver;
	
	
	@Test(priority=1)
	public void LaunchURL() throws IOException {
		

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		  driver.get(Constants.url);
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=2)
	public void LoginErrorMessage_Wrongemailformat() throws InterruptedException, IOException {
		
	
		
		driver.findElement(By.id("input-31"));
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span"));
		LoginBtn.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement err = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='fawn-accounts']/div/div/div/div/div/div/div[2]/pre")));
		String errText = err.getText();
		System.out.println(errText);
		Assert.assertEquals(errText, "Please enter valid email address");
		Thread.sleep(4000);
		driver.findElement(By.id("input-31")).clear();
		
				
	}
	@Test(priority=3)
	public void LoginAction() throws InterruptedException {
		
		
		driver.findElement(By.id("input-31")).sendKeys("vinjavarapu@gmail.com");
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button/span"));
		LoginBtn.click();
		Thread.sleep(4000);
		WebElement password= driver.findElement(By.id("input-39"));
		password.sendKeys("Ravi@123");
		driver.findElement(By.xpath("//*[@id=\"fawn-accounts\"]/div/main/div/div/div[1]/div[2]/div/div[2]/div[5]/div[2]/button[1]/span")).click();
		//driver.close();
	}
	


	@Test(priority=4)
	public void HomePageTitle() {
		
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);
		Assert.assertEquals(HomePageTitle, "Artemis Accounts Portal");
		
	}
	@Test(priority=5)
	public void UserNameDisplay() {
		
		WebDriverWait wa = new WebDriverWait(driver,20);
		WebElement displayName= wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='elk']/div/main/div/div/header/div/button[2]/span/div/div[2]/span")));
		String text = displayName.getText();
		System.out.println(text);
		//driver.quit();
		
	}
	@Test(priority=6)
	public void isCreateNewButtonPresent() {
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[2]/button/span"));
		boolean elementpresent = ele.isDisplayed();
		System.out.println(elementpresent);
		if(elementpresent) {
			
			System.out.println("Create new button is present");
		}
		Assert.assertEquals(elementpresent, true);
	}
	@Test(priority=7)
	public void isCreateNewButtonEnabled() {
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[2]/button/span"));
		boolean elementenabled = ele.isEnabled();
		System.out.println(elementenabled);
		if(elementenabled) {
			
			System.out.println("Create New button is enabled and user can click ");
		}
		Assert.assertEquals(elementenabled, true);
		
		
	}
	@Test(priority=8)
	public void ClickCreatenewproject() {
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[1]/div/div[2]/button/span"));
		ele.click();
		
		
		
	}
	@Test(priority=9)
	public void ClickCancelProjectDialog() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='elk']/div[4]/div/div/div[3]/button/span")).click();
		
		//driver.quit();
	}
	@Test(priority=10)
	public void LogoutAction() throws InterruptedException {
		
		WebDriverWait wa = new WebDriverWait(driver,20);
		WebElement displayName= wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='elk']/div/main/div/div/header/div/button[2]/span/div/div[2]/span")));
		displayName.click();
		Thread.sleep(4000);
	}
	
	@Test(priority=11)
	public void Setting_is_Present() {
		
		WebElement settings = 	driver.findElement(By.xpath("//*[@id=\"elk\"]/div[4]/div/div/div[3]/a"));
		boolean Result = settings.isDisplayed();
		if(Result==true) {
			
			System.out.println("Settigs is present");
			
		}
		Assert.assertEquals(Result, true);
		
	}
	@Test(priority=12)
	public void Settings_is_Clickable() {
		
		WebElement settings = 	driver.findElement(By.xpath("//*[@id=\"elk\"]/div[4]/div/div/div[3]/a"));
		boolean Result = settings.isEnabled();
		if(Result==true) {
			
			System.out.println("Settings link is enabled");
			
		}
		Assert.assertEquals(Result, true);
		
		
	}
	@Test(priority=13)
	public void Settings_Navigations_Popup() throws InterruptedException {
		
		
		WebElement settings = 	driver.findElement(By.xpath("//*[@id=\"elk\"]/div[4]/div/div/div[3]/a"));
		settings.click();
		Thread.sleep(4000);
		
		
		
	}
	@Test(priority=14)
	public void Logout_Click() {
		
		driver.findElement(By.xpath("//*[@id=\"elk\"]/div[1]/main/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[3]/button/span")).click();
		
	}
	@Test(priority=15)
	public void Logout_Confirmation() {
		
		WebElement label = driver.findElement(By.xpath("//*[@id=\"elk\"]/div[5]/div/div/div[2]/pre"));
		String confirmmsg = label.getText();
		System.out.println(confirmmsg);

	}
	@Test(priority=16)
	public void Logout_click() {
		
		driver.findElement(By.xpath("//*[@id=\"elk\"]/div[5]/div/div/div[3]/button[2]/span")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Are you sure you want to logout?");
		
	}
	@AfterTest
	public void closewindows() {
		
		driver.quit();
	}
	

	

}
