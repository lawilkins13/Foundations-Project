Feature: Tester should be able to update an accepted defect's status to Fixed

    Scenario: As a Tester I want to update an accepted defect's status to Fixed if the bug is Fixed

    Given The Tester is on the tester homepage and wants to fix
    When The Tester enters in pending defectID to accept for fix
    When The Tester opens a dropdown of accept or delcine and chooses accept for fix
    When The Tester presses the update status button for fix
    When The Tester sees a new dropdown of the accepted defects status options and chooses to fix
    When The Tester presses the update bug button for fix 
    Then The Tester should have updated the accepted defect status to fixed