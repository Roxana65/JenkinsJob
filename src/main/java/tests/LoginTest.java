package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;


public class LoginTest extends BaseTest{
	
	@Parameters({"user", "pass"})
	@Test(priority=0)
	public void loginTest(String username, String password) throws InterruptedException {
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		//assertTrue(false);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp(username, password);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[@class='menu_user_logout']")).click();
		Thread.sleep(3000);
		
		
	}
	@Test(priority=1)
	public void loginTest2() {
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		//assertTrue(false);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp("username1", "password1");
		
		
	}

}
