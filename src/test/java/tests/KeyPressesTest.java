package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.KeyPressesPage;
import testdata.KeysTestData;

public class KeyPressesTest extends BaseTest{
	KeyPressesPage keyPressesPage;
	
  @BeforeMethod
  public void openKeyPressPage() {	  
	  keyPressesPage = new KeyPressesPage(page);
	  keyPressesPage.navigate();
	  
  }
	
  @Test
  public void testPredefinedSequenceOfKeyPresses() {
	  String[] keysToTest = {"6", "Shift", "Space", "Delete", "a", "Period"};	 
	  
	  for (int i = 0; i < keysToTest.length; i++) {
		  keyPressesPage.pressKey(keysToTest[i]);
		  assertEquals(page.locator(KeyPressesPage.RESULT_SELECTOR).innerText(), "You entered: " + keysToTest[i].toUpperCase(), "result for pressed "+keysToTest[i]+" key is not as expected");
	  }
	  
  }
  
  @Test (dataProvider = "pressKeysTestData", dataProviderClass = KeysTestData.class)
  public void testOtherPredefinedSequenceOfKeyPresses(String parameter, String expected) {
	 keyPressesPage.pressKey(parameter);
	 assertEquals(page.locator(KeyPressesPage.RESULT_SELECTOR).innerText(), "You entered: " + expected, "result for pressed " + parameter + " key is not as expected");
	  
  }
  
  @Test
  public void testEnterKeyPress() {
	  String key = "Enter";
	  keyPressesPage.pressKeyboardKey(key);
	  assertEquals(page.locator(KeyPressesPage.RESULT_SELECTOR).innerText(), "You entered: " + key.toUpperCase(), "result for pressed " + key + " key is not as expected");
  }
  
  
}
