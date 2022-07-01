Feature: Tester should be able to log out of the tester homepage

    Scenario: As A Tester I want to log out my homepage when i am done working on the assigned defects

    Given The Tester is on their tester homepage
    When The Tester clicks the log out button the tester confirms they want to log out
    Then The Tester should be logged out and returned back to the login homepage