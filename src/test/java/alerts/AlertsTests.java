package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPgae = homePage.clickJavascriptAlerts();
        alertsPgae.triggerAlert();
        alertsPgae.alert_clickToAccept();
        assertEquals(alertsPgae.getResult(),"You successfully clicked an alert","Alert text is incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text is incorrect");
    }
    @Test
    public void testSetInputAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_setInput("HI THERE!");
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: HI THERE!","Results text is incorrect");
    }
}
