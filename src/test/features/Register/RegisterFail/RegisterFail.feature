Feature: Register

  Scenario: Verification of Create an Account Button
    Given User Open chrome and launch the application
    When User input email using registered email
    And Click create an account button
    Then the user does not fail to register