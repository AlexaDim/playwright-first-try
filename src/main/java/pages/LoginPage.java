package pages;

import java.util.regex.Pattern;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage extends BasePage{
	 
	 public static final String USERNAME = "tomsmith";
	 public static final String PASSWORD = "SuperSecretPassword!";
	 public static final String URL = BasePage.BASE_URL  + "/login";
	 public static final String LOGGED_BANNER_SELECTOR = "//*[@id='flash']";
	  
	    public LoginPage(Page page) { 
	    	 super(page);
	    } 
	    
	    public void navigate() {
	        super.navigate(URL);
	    }
	    
	 public void login(String username, String password) throws InterruptedException {		 
		 page.getByLabel("Username").fill(username);
		 page.getByLabel("Password").fill(password);
		  
		 page.getByRole(AriaRole.BUTTON,
	              new Page.GetByRoleOptions().setName(
	                  Pattern.compile("Login", Pattern.CASE_INSENSITIVE)))
	   .click();
	 }

}
