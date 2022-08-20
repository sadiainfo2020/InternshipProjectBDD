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


Feature: Positive Test Appliation by providing valid credentials
Scenario Outline: As aregistered user, you should be able to submit the application
Given user lands on QA Engineering application page
Then user write"<firstname>" and "<lastname>"
And user write "<email>"and"<phone>"
Then user select "<state>"
And User can click submit button

Examples:
 |firstname |lastname |email            |phone       |state  |
 |Tom       |TM       |test123@gmail.com|123-456-7890|newyork|
