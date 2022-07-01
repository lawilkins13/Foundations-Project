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

public class TesterShelveDefect {
    
     private WebDriver driver;

    public TesterShelveDefect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "defectID")
    public WebElement testerEnterDefectNameAcceptForShelve;

    @FindBy(id = "Accept-or-Reject")
    public WebElement updateAcceptForShelve;

    @FindBy(tagName = "Button")
    public WebElement updateStatusForAcceptButton;

    @FindBy(tagName = "Button")
    public WebElement updateBugForShelveButton;

    public void testerEnterDefectNameAcceptForShelve(String defectIDAcceptForShelve){
        this.testerEnterDefectNameAcceptForShelve.sendKeys(defectIDAcceptForShelve);
    }
    public void dropdownAcceptForShelve(){
        Select dropdownAcceptChoiceForShelve = new Select(driver.findElement(By.id("Accept-or-Reject")));
        String dropdownAcceptOptionForShelve = "Accepted";
        dropdownAcceptChoiceForShelve.selectByValue(dropdownAcceptOptionForShelve);

        List <WebElement> dropdownAcceptOptionsForShelve = dropdownAcceptChoiceForShelve.getAllSelectedOptions();
        assertEquals(1, dropdownAcceptOptionsForShelve.size());
        assertEquals(dropdownAcceptOptionForShelve, dropdownAcceptOptionsForShelve.get(0).getAttribute("value"));
    }
    public void updateAcceptStatusForShelveButton(){
        this.updateStatusForAcceptButton.click();
    }

    public void dropdownShelve(){
        Select dropdownShelveChoice = new Select(driver.findElement(By.id("Fix-shelve-reject")));
        String dropdownShelveOption = "Shelved";
        dropdownShelveChoice.selectByValue(dropdownShelveOption);

        List<org.openqa.selenium.WebElement> dropdownShelveOptions = dropdownShelveChoice.getAllSelectedOptions();
        assertEquals(1, dropdownShelveOptions.size());
        assertEquals(dropdownShelveChoice, dropdownShelveOptions.get(0).getAttribute("value"));
    }
    public void updateBugForShelveButton(){
        this.updateBugForShelveButton.click();
        WebDriverWait waitShelve = new WebDriverWait(driver,3);
        waitShelve.until(ExpectedConditions.alertIsPresent());
        Alert alertShelve = driver.switchTo().alert();
        alertShelve.accept();
    }
}
