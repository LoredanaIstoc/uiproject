@wip
Feature: As a QA, I would like to verify all negative scenarios for login

  Background:
    Given User is on th sport  page of BBC
  Scenario Outline: Select 'Sign in' , and enter as many negative scenarios as possible.Verify that a error message is displayed and the text that it contains is as expected.

    When User click on "Sign in" module
    Then User should be on Sign in page
    When User enter the unvalid  credentials "<Email>" "<Password>"
    And User click on Sign in button
    Then User should  not be  able to sign in
    And The user get an error message

    Examples:
    |Email                          |Password  |
    |mwohlers3@bravesites.com       | vavhgva  |
    | jtowersey1@constantcontact.com|          |
    |asd1Ef                         |          |
    |                               |@4hPJrQWT3|
    |.                              | ..       |
    |1.                             |11        |