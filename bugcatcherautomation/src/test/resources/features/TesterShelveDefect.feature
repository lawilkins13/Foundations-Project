Feature: Tester should be able to update an accepted defect's status to Shelved

    Scenario: As a Tester I want to update an accepted defect's status to Shelved if the bug is determined low priority

    Given The Tester is on the tester homepage and wants to shelve
    When The Tester enters in pending defectID to accept for shelve
    When The Tester opens a dropdown of accept or decline and chooses accept for shelve
    When The Tester presses the update status button for shelve
    When The Tester sees a new dropdown of the accepted defects status options and chooses to shelve
    When The Tester presses the update bug button for shelve
    Then The Tester should have updated the accepted defect status to Shelved