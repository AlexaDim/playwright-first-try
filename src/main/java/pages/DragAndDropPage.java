package pages;

import com.microsoft.playwright.Page;

public class DragAndDropPage  extends BasePage{
	public static final String URL = BasePage.BASE_URL  + "/drag_and_drop";
	public static final String COLUMN_ONE_SELECTOR = "#column-a"; //id=column-a
	public static final String COLUMN_TWO_SELECTOR = "#column-b";
	
	public DragAndDropPage(Page page) {
		super(page);
	}
	
	 public void navigate() {
	    super.navigate(URL);
	 }
	 
	 public void dragFromTo(String fromSelector, String toSelector) {
		 page.locator(fromSelector).dragTo(page.locator(toSelector));
	 }
	 

	 public String getColumnHeaderText(String selector) {
		 String text = page.locator(selector).innerText();
		 return text;
	 }
}
