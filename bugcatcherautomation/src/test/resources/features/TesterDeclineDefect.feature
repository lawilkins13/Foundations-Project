Feature: Tester should be able to Decline pending defects that were assigned to them in the tester homepage

    Scenario: As a Tester i want to decline a pending defect if it is determined as a low priority bug so I can focus on other defects.

    Given Given The Tester successfully reaches the tester homepage and wants to decline
    When When the Tester enters in the pending defectID to decline
    When the Tester opens a dropdown of Accept or Decline and chooses decline
    When the Tester clicks the Update status Button
    Then the Tester should have updated the pending defect status to declined