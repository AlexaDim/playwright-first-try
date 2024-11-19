package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddRemoveElementsPage extends BasePage{
	
	public static final String URL = BasePage.BASE_URL  + "/add_remove_elements/";
	  
	    public AddRemoveElementsPage(Page page) { 
	    	 super(page); 
	    } 
	    public void navigate() {
	        super.navigate(URL);
	    }
	    
	    public String addElementButtonPath = "//*[@onclick='addElement()']";  
	    public String deleteElementButtonPath = "//*[@onclick='deleteElement()']";  
	    
	    public	Boolean isElementNotPresent(Locator elementThatShoudNotPresent) {
			  if (elementThatShoudNotPresent.count() == 0)
					  return true;
			  else return false;
			}


}
