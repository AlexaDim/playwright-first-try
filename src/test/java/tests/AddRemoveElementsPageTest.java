package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.microsoft.playwright.*;

import pages.AddRemoveElementsPage;


public class AddRemoveElementsPageTest extends BaseTest{

    Boolean buttonsAreRemoved = false;
  
  @Test
  public void addRemoveElementsPageTest() throws InterruptedException {	 
	  AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(page);
	  
      page.navigate(addRemoveElementsPage.url);

      int nunberOfElement = 3;
      
      Locator addElementButton= page.locator(addRemoveElementsPage.addElementButtonPath);  
      for (int i = 1; i <= nunberOfElement; i++) {
    	  addElementButton.click();
	  }


      Locator deleteElementButton = page.locator(addRemoveElementsPage.deleteElementButtonPath);   
      for (int i = 1; i <= nunberOfElement; i++) {
    	  deleteElementButton.all().get(0).click();
	  }    
      
      Locator deleteElementButtonRemoved = page.locator(addRemoveElementsPage.deleteElementButtonPath);        
      buttonsAreRemoved = addRemoveElementsPage.isElementNotPresent(deleteElementButtonRemoved);	  
	  assertTrue(buttonsAreRemoved, "Button is not removed.");
  }
  
}
