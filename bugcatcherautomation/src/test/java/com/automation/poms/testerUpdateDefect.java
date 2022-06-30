package com.automation.poms;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class testerUpdateDefect {
    private WebDriver driver;

    @FindBy(id = "defectID")
    public WebElement defectIDNumberInput;

    @FindBy(id = "Accept-or-Reject")
    public WebElement updateStatusInput;

    @FindBy(id = "Fix-shelve-reject")
    public WebElement updateBugInput;

    @FindBy(tagName = "button")
    public WebElement updatestatusButton;

    @FindBy(tagName = "button")
    public WebElement updateBugButton;

    @FindBy(tagName = "button")
    public WebElement logOutButton; 

    public testerUpdateDefect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void enterDefectID(String defectID){
        this.defectIDNumberInput.sendKeys(defectID);
    }

    public void acceptorRejectDropdown(){
        Select acceptorRejectDropdownChoice = new Select(driver.findElement(By.id("Accept-or-Reject")));
        String acceptorRejectDropdownOption = "Accepted";
        String rejectDropdownOption = "Declined";
        acceptorRejectDropdownChoice.selectByValue(acceptorRejectDropdownOption);
        acceptorRejectDropdownChoice.selectByValue(rejectDropdownOption);


        List <WebElement> acceptorRejectDropdownOptions = acceptorRejectDropdownChoice.getAllSelectedOptions();
        assertEquals(2, acceptorRejectDropdownOptions.size());
        assertEquals(acceptorRejectDropdownOption, acceptorRejectDropdownOptions.get(0).getAttribute("value"));
        assertEquals(rejectDropdownOption, acceptorRejectDropdownOptions.get(0).getAttribute("Value"));
        

    }

    public void updateBugDropdown(){
        Select updateBugDropdownchoice = new Select(driver.findElement(By.id("Fix-shelve-reject")));
        String fixDropdownOption = "Fixed";
        String shelveDropdownOption = "Shelved";
        String rejectDropdownOption = "Rejected";
        updateBugDropdownchoice.selectByValue(fixDropdownOption);
        updateBugDropdownchoice.selectByValue(rejectDropdownOption);
        updateBugDropdownchoice.selectByValue(shelveDropdownOption);

        List <WebElement> updateBugDropdownOptions = updateBugDropdownchoice.getAllSelectedOptions();
        assertEquals(3, updateBugDropdownOptions.size());
        assertEquals(fixDropdownOption, updateBugDropdownOptions.get(0).getAttribute("value"));
        assertEquals(shelveDropdownOption, updateBugDropdownOptions.get(0).getAttribute("value"));
        assertEquals(rejectDropdownOption, updateBugDropdownOptions.get(0).getAttribute("value"));
    }

    public void updateStatusButton(){
        this.updateStatusButton();
    }

    public void updateBugButton(){
        this.updateBugButton();
    }

    public void LogOutButton(){
        this.LogOutButton();
    }
}
