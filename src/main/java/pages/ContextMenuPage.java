package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By menuField = By.id("hot-spot");
    Actions actions;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }
    public void contextClick(){
        WebElement menuElement = driver.findElement(menuField);
        actions.contextClick(menuElement).perform();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
}
