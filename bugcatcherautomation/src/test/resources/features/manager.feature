Feature: Manager should be able to Create and assign Defects to the tester so they can be worked on

    Scenario: As A manager I want to create defects so that I can start Addressing them

    Given The manager signs in and reaches their homepage
    When the manager enters the Defect name
    When the Manager Types in the tester chosen
    When the manager clicks the assign button 
    Then the manager should have created and assigned a new pending defect.


