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

public class TesterRejectDefect {
    
    private WebDriver driver;
    
    public TesterRejectDefect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "defectID")
    public WebElement testerEnterDefectNameAcceptForReject;

    @FindBy(id = "Accept-or-Reject")
    public WebElement updateAcceptForReject;

    @FindBy(tagName = "Button")
    public WebElement updateStatusForAcceptButton;

    @FindBy(tagName = "Button")
    public WebElement updateBugForRejectButton;

    public void testerEnterDefectNameAccept(String defectIDAcceptForReject){
        this.testerEnterDefectNameAcceptForReject.sendKeys(defectIDAcceptForReject);
    }
    public void dropdownAcceptForReject(){
        Select dropdownAcceptChoiceForReject = new Select(driver.findElement(By.id("Accept-or-Reject")));
        String dropdownAcceptOptionForReject = "Accepted";
        dropdownAcceptChoiceForReject.selectByValue(dropdownAcceptOptionForReject);

        List <WebElement> dropdownAcceptOptionsForReject = dropdownAcceptChoiceForReject.getAllSelectedOptions();
        assertEquals(1, dropdownAcceptOptionsForReject.size());
        assertEquals(dropdownAcceptOptionForReject, dropdownAcceptOptionsForReject.get(0).getAttribute("value"));
    }
    public void updateAcceptStatusForRejectButton(){
        this.updateStatusForAcceptButton.click();
    }

    public void dropdownReject(){
        Select dropdownRejectChoice = new Select(driver.findElement(By.id("Fix-shelve-reject")));
        String dropdownRejectOption = "Rejected";
        dropdownRejectChoice.selectByValue(dropdownRejectOption);

        List<org.openqa.selenium.WebElement> dropdownRejectOptions = dropdownRejectChoice.getAllSelectedOptions();
        assertEquals(1, dropdownRejectOptions.size());
        assertEquals(dropdownRejectChoice, dropdownRejectOptions.get(0).getAttribute("value"));
    }
    public void updateBugForRejectButton(){
        this.updateBugForRejectButton.click();
        WebDriverWait waitReject = new WebDriverWait(driver,3);
        waitReject.until(ExpectedConditions.alertIsPresent());
        Alert alertReject = driver.switchTo().alert();
        alertReject.accept();
    }
}
