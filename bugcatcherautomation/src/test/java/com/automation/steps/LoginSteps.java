package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginSteps {

 /*
  User agnostic steps below 
 */
 
@Given("The employee is on the login page")
public void the_employee_is_on_the_login_page() {
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/bugcatcherautomation/src/test/resources/webpages/Wayne-Enterprises-login-page.html");
}

@When("the employee clicks the login button")
public void the_employee_clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.clickButton();
}


/* 
  Manager steps below
*/

@When("the manager enters their correct username")
public void the_Tester_enters_their_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("Wayne21");
}
@When("the manager enters their correct password")
public void the_Tester_enters_their_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("Vengeance");
}
@Then("the manager should be logged in to the manager homepage")
public void the_Tester_should_be_logged_in_to_the_tester_homepage() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.titleIs("Bruce Waynes Homepage"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Bruce Waynes Homepage", title);
}

/* 
   Tester Steps below
*/

@When("the Tester enters their correct username")
public void the_manager_enters_their_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("FlyingG");
}
@When("the Tester enters their correct password")
public void the_manager_enters_their_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("Grayson22");
}
@Then("the Tester should be logged in to the tester homepage")
public void the_manager_should_be_logged_in_to_the_manager_homepage() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.titleIs("Dick Grayson's Homepage"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Dick Grayson's Homepage", title);
}
}
