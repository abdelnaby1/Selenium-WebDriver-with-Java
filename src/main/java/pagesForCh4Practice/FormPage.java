package pagesForCh4Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
    private  WebDriver driver;
    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobTitleField = By.id("job-title");
    private By highestLevelOfEducation = By.id("radio-button-");
    private By Sex = By.id("checkbox-1");
    private By selectMenu = By.id("select-menu");
    private Select yearsOfExperience;

    private By datepicker = By.id("datepicker");
    private By submitButton = By.xpath("/html/body/div/form/div/div[8]/a");
    public void setFirstNameField(String firstname){
        driver.findElement(firstNameField).sendKeys(firstname);
    }
    public void setLastNameField(String lastname){
        driver.findElement(lastNameField).sendKeys(lastname);
    }
    public void setJobTitleField(String jobTitle){
        driver.findElement(jobTitleField).sendKeys(jobTitle);
    }
    public void setHighestLevelOfEducation(char idx){
        if(idx > '3' || idx < '1') idx = '1';
        driver.findElement(By.id("radio-button-"+idx)).click();
    }
    public void setSex(char idx){
        if(idx > '3' || idx < '1') idx = '1';
        driver.findElement(By.id("checkbox-"+idx)).click();
    }
    public void setYearsOfExperience(String years){
        yearsOfExperience = new Select(driver.findElement(selectMenu));
        yearsOfExperience.selectByVisibleText(years);
    }
    public void setDate(String date){
        driver.findElement(datepicker).sendKeys(date);
    }
    public ThanksPage clickSubmit(){
        driver.findElement(submitButton).click();
        return new ThanksPage(driver);
    }
}
