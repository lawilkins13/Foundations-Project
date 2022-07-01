package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterDeclineDefectSteps {
    
    @Given("Given The Tester successfully reaches the tester homepage and wants to decline")
public void given_The_Tester_successfully_reaches_the_tester_homepage_and_wants_to_decline() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}

@When("When the Tester enters in the pending defectID to decline")
public void when_the_Tester_enters_in_the_pending_defectID_to_decline() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerDeclineDefect.testerEnterDefectNameDecline("74561");
}
@When("the Tester opens a dropdown of Accept or Decline and chooses decline")
public void the_Tester_opens_a_dropdown_of_Accept_or_Decline_and_chooses_decline() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerDeclineDefect.dropdownDecline();
}
@When("the Tester clicks the Update status Button")
public void the_Tester_clicks_the_Update_status_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerDeclineDefect.updateDeclineStatusButton();
}
@Then("the Tester should have updated the pending defect status to declined")
public void the_Tester_should_have_updated_the_pending_defect_status_to_declined() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}
}
