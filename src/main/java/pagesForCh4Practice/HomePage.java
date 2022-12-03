package pagesForCh4Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By completeWebFormLink = By.xpath("//*[@id='navbarNavDropdown']/ul/li[1]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public FormPage clickCompleteWebForm(){
        driver.findElement(completeWebFormLink).click();
        return new FormPage(driver);
    }
}
