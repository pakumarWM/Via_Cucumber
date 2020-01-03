#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Via login

  Scenario: login with valid credentials
    Given user launch Browser
    Then user enter the URL
    Then user enter username and password
    Then Click signin button
    
   Scenario: Check Import user
    Given Click on imports link
    Then Click on import users
    Then Click on upload user csv file
    And Verify csv uploaded

#	Scenario: Check Import Hirarchy
#    Given Click on imports link
#    Then Click on import hirarchy
#    Then Click on upload user csv file
#    And Verify csv uploaded
#    
#    Scenario: Check Import Group templates
#    Given Click on imports link
#    Then Click on import group templates
#    Then Click on upload user csv file
#    And Verify csv uploaded
#    
#    Scenario: Check Import groups
#    Given Click on imports link
#    Then Click on import groups
#    Then Click on upload user csv file
#    And Verify csv uploaded
#    
#    Scenario: Check Import membership
#    Given Click on imports link
#    Then Click on import membership
#    Then Click on upload user csv file
#    And Verify csv uploaded
