package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testerSteps {
    @Given("The Tester successfully reaches their homepage")
public void the_Tester_successfully_logs_in_and_accesses_their_homepage() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}

@When("the Tester enters in the defectId assigned")
public void the_Tester_types_in_the_defectId_assigned() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.enterDefectID("defectID");
    
}
@When("the Tester selects Accept or Decline")
public void the_Tester_selects_Accept_or_Reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.acceptorRejectDropdown();
    
}
@When("the Tester clicks the Update status button")
public void the_Tester_clicks_the_Update_status_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.updateStatusButton();
}
@When("the Tester Updates from Pending to Accepted")
public void the_Tester_Updates_from_Pending_to_Accepted() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.acceptorRejectDropdown();
}
@When("the Tester Fixes the defect")
public void the_Tester_Fixes_the_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.updateBugDropdown();
}
@When("the Tester Shelves the defect")
public void the_Tester_Shelves_the_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.updateBugDropdown();
}
@When("the Tester Rejects the defect")
public void the_Tester_Rejects_the_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.updateBugDropdown();
}
@When("the Tester updates from pending to Declined")
public void the_Tester_updates_from_pending_to_Declined() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.acceptorRejectDropdown();
}
@When("the Tester Clicks the button update bug")
public void the_Tester_Clicks_the_button_update_bug() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.updateBugButton();
}
@When("the Tester Clicks the button No more Enemies")
public void the_Tester_Clicks_the_button_No_more_Enemies() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerUpdateDefect.LogOutButton();
}
@Then("The Tester should be returned back to the login homepage")
public void the_Tester_should_be_returned_back_to_the_login_homepage() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Wayne-Enterprises-login-page.html");
}

}
