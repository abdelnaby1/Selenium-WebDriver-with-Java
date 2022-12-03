package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.ResetPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPassword() throws InterruptedException {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();

        forgotPasswordPage.setEmailField("ahmed@test.com");
        ResetPasswordPage resetPasswordPage = forgotPasswordPage.retrievePassword();
        Thread.sleep(3000);
        //THERE IS MUST BE AN ASSERTION BUT THERE IS AN INTERNAL SERVER ERROR
    }
}
