package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesterLogout {
    
    private WebDriver driver;

    public TesterLogout(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logout")
    public WebElement logOutButton;

    public void clickLogoutButton(){
        this.logOutButton.click();
        WebDriverWait waitLogout = new WebDriverWait(driver,10);
        waitLogout.until(ExpectedConditions.alertIsPresent());
        Alert alertLogout = driver.switchTo().alert();
        alertLogout.accept();

        WebDriverWait waitLogoutNow = new WebDriverWait(driver,10);
        waitLogoutNow.until(ExpectedConditions.alertIsPresent());
        Alert alertLogoutNow = driver.switchTo().alert();
        alertLogoutNow.accept();
    }
}
