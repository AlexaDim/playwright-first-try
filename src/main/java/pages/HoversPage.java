package pages;

import com.microsoft.playwright.Page;

public class HoversPage extends BasePage{
	public static final String URL = BasePage.BASE_URL  + "/hovers";

	public HoversPage(Page page) {
		super(page);
	}
	
	 public void navigate() {
	    super.navigate(URL);
	 }
	 
	 public void hoverOn(int imageNumber) {
		 
		 page.hover("//*[@id=\"content\"]/div/div[" + imageNumber + "]/img");
	 }

     public String getTextOfHoveredImage(int imageNumber) {		 
		 return page.locator(".figcaption h5").all().get(imageNumber - 1).innerText();
	 }
}
