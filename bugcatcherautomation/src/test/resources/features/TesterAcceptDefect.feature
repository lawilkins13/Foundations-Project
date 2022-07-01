Feature: Tester should be able to accept pending defects that were assigned to them in the tester homepage

Scenario: As A Tester I want to accept a pending defect if it is chosen to be a valid bug, so i can work on it properly

    Given The Tester successfully reaches the tester homepage and wants to accept
    When the Tester enters in the pending defectID to accept
    When the Tester opens a dropdown of Accept or Decline and chooses accept
    When the Tester clicks the Update status button
    Then the Tester should have updated the pending defect status to accepted
    
