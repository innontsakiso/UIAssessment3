Feature: Application Login

  Scenario: Home page default login
    Given User is on landing page
    When User login to application with username and password
    Then Home page is populated
    And Products displayed are

  Scenario: Home page default login
    Given User is on landing page
    When User login to application with username "standard" and password "secret_sauce"
    Then Home page is populated are "false"
    And Products displayed are "false"