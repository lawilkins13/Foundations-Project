package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterRejectDefectSteps {
    
    @Given("The Tester is on the tester homepage and wants to reject")
public void the_Tester_is_on_the_tester_homepage_and_wants_to_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}
@When("The Tester enters in pending defectID to accept for reject")
public void the_Tester_enters_in_pending_defectID_to_accept_for_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerRejectDefect.testerEnterDefectNameAccept("57988");
}
@When("The Tester opens a dropdown of accept or decline and chooses accept for reject")
public void the_Tester_opens_a_dropdown_of_accept_or_delcine_and_chooses_accept_for_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerRejectDefect.dropdownAcceptForReject();
}
@When("The Tester presses the update status button for reject")
public void the_Tester_presses_the_update_status_button_for_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerRejectDefect.updateAcceptStatusForRejectButton();
}
@When("The Tester sees a new dropdown of the accepted defects status options and chooses to reject")
public void the_Tester_sees_a_new_dropdown_of_the_accepted_defects_status_options_and_chooses_to_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerRejectDefect.dropdownReject();
}
@When("The Tester presses the update bug button for reject")
public void the_Tester_presses_the_update_bug_button_for_reject() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.testerRejectDefect.updateBugForRejectButton();
}
@Then("The Tester should have updated the accepted defect status to Rejected")
public void the_Tester_should_have_updated_the_accepted_defect_status_to_rejected() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/Dick-Grayson-Tester-Homepage.html");
}
}
