package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
  @Test
  public void testContextMenu(){
    ContextMenuPage contextMenuPage = homePage.clickContextMenu();
    contextMenuPage.rightClickInBox();
    String text = contextMenuPage.getTextFromAlert();
    contextMenuPage.closeAlert();
    assertEquals(text, "You selected a context menu", "Incorrect text");

  }
}
