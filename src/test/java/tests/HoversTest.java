package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HoversPage;

public class HoversTest extends BaseTest{
  @Test
  public void hoverOverElemetToSeeText() {
	  HoversPage hoversPage = new HoversPage(page);
	  hoversPage.navigate();
	  
	  for (int i = 1; i <= 3; i++) {
		  hoversPage.hoverOn(i);
		  assertEquals(hoversPage.getTextOfHoveredImage(i), "name: user" + i, "Text under image "+i+" is not as expected");
	  }
  }
}
