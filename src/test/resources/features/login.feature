@Bookit
Feature: Bookit login functionality

  Agile Story: As a user I should be able to login to Bookit

  Background:
    Given I am on the login page


    Scenario: Verify that user can login with valid credentials
      When I enter valid username "mnewbatt8o@utexas.edu" and password "opalcave" login credentials
      Then I should be on the home page

#    Scenario:Verify that user gets error message as "[objectProgressEvent]" when user enters invalid credentials
#      When I enter invalid login credentials
#      Then I should see object message