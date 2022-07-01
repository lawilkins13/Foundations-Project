package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterAcceptDefect {
   
    @Given("The Tester successfully reaches the tester homepage and wants to accept")
public void the_Tester_successfully_reaches_the_tester_homepage_and_wants_to_accept() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}
@When("the Tester enters in the pending defectID to accept")
public void the_Tester_enters_in_the_pending_defectID_to_accept() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerAcceptDefect.testerEnterDefectNameAccept("96519");
}
@When("the Tester opens a dropdown of Accept or Decline and chooses accept")
public void the_Tester_opens_a_dropdown_of_Accept_or_Decline_and_chooses_accept() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerAcceptDefect.dropdownAccept();
}
@When("the Tester clicks the Update status button")
public void the_Tester_clicks_the_Update_status_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerAcceptDefect.updateAcceptStatusButton();
}
@Then("the Tester should have updated the pending defect status to accepted")
public void the_Tester_should_have_updated_the_pending_defect_status_to_accepted() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}
}
   