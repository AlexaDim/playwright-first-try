package pages;

import com.microsoft.playwright.Page;

public class KeyPressesPage extends BasePage{
	public static final String URL = BasePage.BASE_URL  + "/key_presses";
	public static final String FIELD_SELECTOR = "#target";
	public static final String RESULT_SELECTOR = "#result";
	
	public KeyPressesPage(Page page) {
		super(page);
	}
	
	 public void navigate() {
		    super.navigate(URL);
		 }
	 
	
	public void pressKey(String key) {
		page.locator(FIELD_SELECTOR).press(key);
	 }
	
	public void pressKeyboardKey(String key) {
		page.keyboard().press(key);
	 }

}
