package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private  WebDriver driver;
    private By slider = By.xpath("//*[@id='content']/div/div/input");
    private By rangeLabel = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isDisplayed(){
        return driver.findElement(slider).isDisplayed();
    }
    public void changeRange(int times){
        var ele = driver.findElement(slider);
//        ele.click();
        for (int i = 0; i < times; i++) {
            ele.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult(){
        return driver.findElement(rangeLabel).getText();
    }
}
