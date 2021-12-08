package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        DropdownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        Object selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(((List) selectedOptions).size(), 1, "Incorrect number of selections");
        assertTrue(((List) selectedOptions).contains(option), "Option not selected");
    }
}
