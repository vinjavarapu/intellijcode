package Onboardingnewclient;

import java.io.IOException;

import Login.BaseTest;
import Login.Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SettingsPage extends BaseTest {
	

	Login_Test login = new Login_Test();

	@Test(priority=1)
	public void NavigatetoSettingsPage() throws InterruptedException {

		 login.LogintoApp();
		 Thread.sleep(3000);
	     driver.findElement(By.cssSelector("#elk > div.v-application--wrap > main > div > div > header > div > button.v-btn.v-btn--flat.v-btn--rounded.v-btn--text.theme--light.elevation-0.v-size--default.primary--text.art-btn.px-0.user-popup-button > span > div > div.px-0.pl-2.col.col-auto > span")).click();
	}
	@Test(priority=2)
	public void click_SettingsTab() {
		
		driver.findElement(By.cssSelector("#elk > div.v-menu__content.theme--light.v-menu__content--fixed.menuable__content__active.user-popup-menu > div > div > div:nth-child(3) > a")).click();
	}
	@Test(priority=3)
	public void AccountsTab_exists() {
		
		WebElement text = driver.findElement(By.cssSelector("#elk > div.v-application--wrap > nav > div.v-navigation-drawer__content > div > a.sidenav-item.v-list-item--active.v-list-item.v-list-item--dense.v-list-item--link.theme--light > div"));
		
		String text_account = text.getText();
		
		System.out.println("The label of Account tab is " + text_account);
		//Assert.assertEquals(text_account, "Account");

}
}
