package com.automation.poms;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class TesterAcceptDefect {
    
    private WebDriver driver;
    
    public TesterAcceptDefect(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "defectID")
    public WebElement testerEnterDefectNameAccept;

    @FindBy(id = "Accept-or-Reject")
    public WebElement updateAccept;

    @FindBy(tagName = "Button")
    public WebElement updatestatusButton;

    public void testerEnterDefectNameAccept(String defectIDAccept){
        this.testerEnterDefectNameAccept.sendKeys(defectIDAccept);
    }
    public void dropdownAccept(){
        Select dropdownAcceptChoice = new Select(driver.findElement(By.id("Accept-or-Reject")));
        String dropdownAcceptOption = "Accepted";
        dropdownAcceptChoice.selectByValue(dropdownAcceptOption);

        List <WebElement> dropdownAcceptOptions = dropdownAcceptChoice.getAllSelectedOptions();
        assertEquals(1, dropdownAcceptOptions.size());
        assertEquals(dropdownAcceptOption, dropdownAcceptOptions.get(0).getAttribute("value"));
    }
    public void updateAcceptStatusButton(){
        this.updatestatusButton.click();
    }
    }
