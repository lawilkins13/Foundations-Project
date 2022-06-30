package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managerCreateDefect {
    private WebDriver driver;

    @FindBy(id = "Joker's Back")
    public WebElement defectNameInput;

    @FindBy(id = "Dick Grayson")
    public WebElement assignedTesterInput;

    @FindBy(tagName = "button")
    public WebElement assignButton;

    public managerCreateDefect(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
    public void enterDefectName(String defectName){
        this.defectNameInput.sendKeys(defectName);
    }
    public void enterAssignedTester(String assignedTester){
        this.assignedTesterInput.sendKeys(assignedTester);
    }
    public void clickButton(){
        this.assignButton.click();
    }
    

}
