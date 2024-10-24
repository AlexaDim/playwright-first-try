package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddRemoveElementsPage {
	Page page; 
	  
	    public AddRemoveElementsPage(Page page) { 
	        this.page = page; 
	    } 
	    
	    public String url = "https://the-internet.herokuapp.com/add_remove_elements/";
	    public String addElementButtonPath = "//*[@onclick='addElement()']";  
	    public String deleteElementButtonPath = "//*[@onclick='deleteElement()']";  
	    
	    public	Boolean isElementNotPresent(Locator elementThatShoudNotPresent) {
			  if (elementThatShoudNotPresent.count() == 0)
					  return true;
			  else return false;
			}


}
