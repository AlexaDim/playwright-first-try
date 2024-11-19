package tests;

import org.testng.annotations.Test;
import com.microsoft.playwright.*;

import pages.LoginPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest extends BaseTest{
  @Test
  public void loginTest() throws InterruptedException {	  
	  LoginPage loginPage = new LoginPage(page);
	  loginPage.navigate();
	  loginPage.login(LoginPage.USERNAME, LoginPage.PASSWORD);
	  
	  Locator loggedinBanner = page.locator(LoginPage.LOGGED_BANNER_SELECTOR);
	  assertThat(loggedinBanner).containsText("You logged into a secure area!");;
	
  }
}
