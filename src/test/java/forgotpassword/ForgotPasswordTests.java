package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

  @Test
  public void testRetrievePassword(){
    ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
    EmailSentPage emailSentPage = forgotPasswordPage.retrievePassword("test@test.com");
    assertTrue(emailSentPage.getMessage().contains("Your e-mail's been sent!"), "Message is incorrect");

  }

}
