Feature: Tester should be able to enter the defectID, and should begin working on it once they have reached their homeage.

Scenario: As A Tester I want enter the defectID So That I can begin working on them.

    Given The Tester successfully reaches their homepage
    When the Tester enters in the defectId assigned
    When the Tester selects Accept or Decline
    When the Tester clicks the Update status button
    When the Tester Updates from Pending to Accepted
    When the Tester Fixes the defect
    When the Tester Shelves the defect
    When the Tester Rejects the defect
    When the Tester updates from pending to Declined
    When the Tester Clicks the button update bug
    When the Tester Clicks the button No more Enemies 
    Then The Tester should be returned back to the login homepage
