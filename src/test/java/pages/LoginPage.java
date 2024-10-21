package pages;

import java.util.regex.Pattern;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
	 Page page; 
	 public static final String USERNAME = "tomsmith";
	 public static final String PASSWORD = "SuperSecretPassword!";
	  
	    public LoginPage(Page page) { 
	        this.page = page; 
	    } 
	    
	 public void login(String username, String password) {
		  page.navigate("https://the-internet.herokuapp.com/login");
		  page.getByLabel("Username").fill(username);
		  page.getByLabel("Password").fill(password);
		  
		  page.getByRole(AriaRole.BUTTON,
	              new Page.GetByRoleOptions().setName(
	                  Pattern.compile("Login", Pattern.CASE_INSENSITIVE)))
	   .click();
	 }

}
