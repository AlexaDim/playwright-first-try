package pages;

import com.microsoft.playwright.Page;

public class BasePage {
	Page page; 
	public static final String BASE_URL  = "https://the-internet.herokuapp.com";
	
	public BasePage(Page page) { 
        this.page = page; 
    } 
	
	public void navigate(String url) {
        page.navigate(url);
    }

}
