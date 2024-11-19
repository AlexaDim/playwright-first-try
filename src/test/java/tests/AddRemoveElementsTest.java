package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.microsoft.playwright.*;

import pages.AddRemoveElementsPage;


public class AddRemoveElementsTest extends BaseTest{

    Boolean buttonsAreRemoved = false;
  
  @Test
  public void addRemoveElementsTest() throws InterruptedException {	 
	  AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(page);

	  addRemoveElementsPage.navigate();

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
