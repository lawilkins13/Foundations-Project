package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is going to be my Java version of my login webpage
public class Login {
    /*
      by defining what web elements we want to interact with here instead of in the steps themselves we avoid writing
      "boilerplate" (think redundant/repretive) code.
     */
    private WebDriver driver; // this driver will only be used internally (in the class) so it is private

     //
     @FindBy(id = "username") 
     public WebElement usernameInput;

     @FindBy(id = "password")
     public WebElement passwordInput;

     @FindBy(tagName = "button")
     public WebElement loginButton;

     public Login(WebDriver driver){
      this.driver = driver; // this initializes the private driver field

      /*
       The PageFactory class is provided by selnium and it abstracts away from us the code tha hand intitlaizing our WebElement fields. we simply
       provide the initElements() method with the private driver
      */
      PageFactory.initElements(driver,this);
      
      }

     public void enterUsername(String username){
       this.usernameInput.sendKeys(username);
     }

     public void enterPassword(String password){
        this.passwordInput.sendKeys(password);

     }

     public void clickButton(){
        this.loginButton.click();

     }
}
