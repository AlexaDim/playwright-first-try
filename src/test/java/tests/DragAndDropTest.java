package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DragAndDropPage;


public class DragAndDropTest extends BaseTest{
  @Test
  public void dragAndDropTest() {
	  DragAndDropPage dragAndDropPage = new DragAndDropPage(page);
	  dragAndDropPage.navigate();
	  
	  //drag from 1st column to 2nd
	  dragAndDropPage.dragFromTo(DragAndDropPage.COLUMN_ONE_SELECTOR, DragAndDropPage.COLUMN_TWO_SELECTOR);
	  assertEquals(dragAndDropPage.getColumnHeaderText(DragAndDropPage.COLUMN_ONE_SELECTOR), "B", "Text for first column is not correct");
	  
	  //drag from 2nd column to 1st
	  dragAndDropPage.dragFromTo(DragAndDropPage.COLUMN_TWO_SELECTOR, DragAndDropPage.COLUMN_ONE_SELECTOR);
	  assertEquals(dragAndDropPage.getColumnHeaderText(DragAndDropPage.COLUMN_ONE_SELECTOR), "A", "Text for first column is not correct");
  }
}
