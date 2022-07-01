package com.automation.poms;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesterFixDefect {
    
    private WebDriver driver;
    
    public TesterFixDefect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "defectID")
    public WebElement testerEnterDefectNameAcceptForFix;

    @FindBy(id = "Accept-or-Reject")
    public WebElement updateAcceptForFix;

    @FindBy(tagName = "Button")
    public WebElement updateStatusForAcceptButton;

    @FindBy(tagName = "Button")
    public WebElement updateBugForFixButton;

    public void testerEnterDefectNameAccept(String defectIDAcceptForFix){
        this.testerEnterDefectNameAcceptForFix.sendKeys(defectIDAcceptForFix);
    }
    public void dropdownAcceptForFix(){
        Select dropdownAcceptChoiceForFix = new Select(driver.findElement(By.id("Accept-or-Reject")));
        String dropdownAcceptOptionForFix = "Accepted";
        dropdownAcceptChoiceForFix.selectByValue(dropdownAcceptOptionForFix);

        List <WebElement> dropdownAcceptOptionsForFix = dropdownAcceptChoiceForFix.getAllSelectedOptions();
        assertEquals(1, dropdownAcceptOptionsForFix.size());
        assertEquals(dropdownAcceptOptionForFix, dropdownAcceptOptionsForFix.get(0).getAttribute("value"));
    }
    public void updateAcceptStatusButton(){
        this.updateStatusForAcceptButton.click();
    }

    public void dropdownFix(){
        Select dropdownFixChoice = new Select(driver.findElement(By.id("Fix-shelve-reject")));
        String dropdownFixOption = "Fixed";
        dropdownFixChoice.selectByValue(dropdownFixOption);

        List<org.openqa.selenium.WebElement> dropdownFixOptions = dropdownFixChoice.getAllSelectedOptions();
        assertEquals(1, dropdownFixOptions.size());
        assertEquals(dropdownFixChoice, dropdownFixOptions.get(0).getAttribute("value"));
    }
    public void updateBugForFixButton(){
        this.updateBugForFixButton.click();
        WebDriverWait waitFix = new WebDriverWait(driver,3);
        waitFix.until(ExpectedConditions.alertIsPresent());
        Alert alertFix = driver.switchTo().alert();
        alertFix.accept();
    }
}
