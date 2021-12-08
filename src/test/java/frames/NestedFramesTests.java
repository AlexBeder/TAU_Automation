package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

  @Test
  public void testNestedFrames(){
    FramesPage framesPage = homePage.clickFrames();
    NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
    assertEquals(nestedFramesPage.getTextFromLeftFrame(), "LEFT", "incorrect frame");
    assertEquals(nestedFramesPage.getTextFromBottomFrame(), "BOTTOM", "incorrect frame");
  }
}
