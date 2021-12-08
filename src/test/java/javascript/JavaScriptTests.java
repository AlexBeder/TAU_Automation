package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    /************************************************************
     NOTE: We did not add assertions to these tests in the video
    ************************************************************/

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testDDL() {
        DropdownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.changeDDLToMultiSelection();
        String option = "Option 1";
        String option2 = "Option 2";
        dropDownPage.selectFromDropDown(option);
        dropDownPage.selectFromDropDown(option2);

        Object selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(((List) selectedOptions).size(), 2, "Incorrect number of selections");
        assertTrue(((List) selectedOptions).contains(option), "Option1 not selected");
        assertTrue(((List) selectedOptions).contains(option2), "Option2 not selected");
    }
}
/************************************************************
 NOTE: Solution below is for java 9+
 ************************************************************/
// var dropDownPage = homePage.clickDropDown();
//        dropDownPage.addMultipleAttribute();
//
//        var optionsToSelect = List.of("Option 1", "Option 2");
//        optionsToSelect.forEach(dropDownPage::selectFromDropDown);
//
//        var selectedOptions = dropDownPage.getSelectedOptions();
//        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
//        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");