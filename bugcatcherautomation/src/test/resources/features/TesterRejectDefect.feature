Feature: Tester should be able to update an accepted defect's status to Rejected

    Scenario: As a Tester I want to update an accepted defect's status to Rejected if the bug is determined low priority

    Given The Tester is on the tester homepage and wants to reject
    When The Tester enters in pending defectID to accept for reject
    When The Tester opens a dropdown of accept or decline and chooses accept for reject
    When The Tester presses the update status button for reject
    When The Tester sees a new dropdown of the accepted defects status options and chooses to reject
    When The Tester presses the update bug button for reject
    Then The Tester should have updated the accepted defect status to rejected