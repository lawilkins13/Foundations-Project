Feature: Tester should be able to view assigned defects, and should begin working on these defects after they have successfully logged in

Scenario: As A Tester I want to view defects assigned to me So That I can begin working on them.

    Given The Tester successfully logs in and accesses their homepage
    When the Tester types in the defectId assigned
    When the Tester selects Accept or Reject
    When the Tester clicks the Update status button
    When the Tester Updates from Pending to Accepted
    When the Tester Fixes the defect
    When the Tester Shelves the defect
    When the Tester Rejects the defect
    When the Tester updates from pending to Declined
    When the Tester Clicks the button update bug
    When the Tester Clicks the button No more Enemies 
    Then The Tester should be returned back to the login homepage
