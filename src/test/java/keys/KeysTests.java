package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testHorizontalSlider(){

        HorizontalSliderPage keyPage = homePage.clickHorizontalSlider();
        keyPage.moveSlider(4);
        assertEquals(keyPage.getSliderValue(), "4", "Slider value is incorrect");
    }


    @Test
    public void testPi(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        /*
            NOTE: we didn't finish this test in the video.
            We debugged to watch it enter the pi key
         */
    }
}
