package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class managerSteps {
   
    @Given("The manager signs in and reaches their homepage")
    public void the_manager_signs_in_and_reaches_their_homepage() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/bugcatcherautomation/src/test/resources/webpages/Bruce-Wayne-manager-homepage.html"); 
}
@When("the manager enters the Defect name")
public void the_manager_enters_the_Defect_name() {
    // Write code here that turns the phrase above into concrete actions
        TestRunner.managerCreateDefect.enterDefectName("Joker's Back"); // always make sure to match with your poms inputs
}
@When("the Manager Types in the tester chosen")
public void the_Manager_Types_in_the_tester_chosen() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.managerCreateDefect.enterAssignedTester("Dick Grayson");
}
@When("the manager clicks the assign button")
public void the_manager_clicks_the_assign_button() {
    // Write code here that turns the phrase above into concrete actions
        TestRunner.managerCreateDefect.clickButton();
}
@Then("the manager should have created and assigned a new pending defect.")
public void the_manager_should_have_created_and_assigned_a_new_pending_defect() {
    // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/VSC work/Week4/Day4/Log-automation-project/bugcatcherautomation/src/test/resources/webpages/Bruce-Wayne-manager-homepage.html");
}
}
