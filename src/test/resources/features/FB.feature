@Facebook
Feature: Test FaceBook Landing Page functionalities

  @negative
  Scenario: Unsuccessful login using invalid credentials
    Given User is on the facebook page
    When User enters username
      | jabz@gmail.com |
    And User enters password
      | mysecretpassword |
    And User clicks login button
    Then Incorrect password is displayed