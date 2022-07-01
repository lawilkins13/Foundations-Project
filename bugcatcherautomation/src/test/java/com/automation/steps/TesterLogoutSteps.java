package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TesterLogoutSteps{
    
    @Given("The Tester is on their tester homepage")
    public void The_Tester_is_on_their_tester_homepage(){
     // Write code here that turns the phrase above into concrete actions
     TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
    }
    @When("The Tester clicks the log out button the tester confirms they want to log out")
    public void The_Tester_clicks_the_log_out_button_the_tester_confirms_they_want_to_log_out(){
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerLogout.clickLogoutButton();
    }
    @Then("The Tester should be logged out and returned back to the login homepage")
    public void The_Tester_should_be_looged_out_and_returned_back_to_the_login_homepage(){
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
    }
}
