Feature: Users of my bug catcher application should be able to login to their respective homepages

    Scenario: As a manager I want to sign in so i can view my custom homepage 

        Given The employee is on the login page
        When the manager enters their correct username 
        When the manager enters their correct password
        When the employee clicks the login button
        Then the manager should be logged in to the manager homepage

    Scenario: As a Tester I want to sign in so i can view my custom homepage 

        Given The employee is on the login page
        When the Tester enters their correct username 
        When the Tester enters their correct password
        When the employee clicks the login button
        Then the Tester should be logged in to the tester homepage

