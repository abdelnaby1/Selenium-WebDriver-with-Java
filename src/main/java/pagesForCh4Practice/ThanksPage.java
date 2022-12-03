package pagesForCh4Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksPage {
    private  WebDriver driver;
    private By statusMessage = By.cssSelector("div[role='alert']");

    public ThanksPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getStatusMessage(){
        return driver.findElement(statusMessage).getText();
    }
}
