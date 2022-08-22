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
#Sample Feature Definition TemplateA


Feature: Courses test feature 
# 1
Scenario: Positive Test feature
Given user launch the browser
When user lands on the home page
Then user clicks on courses feature
And clicks on dropdown arrow
Then clicks QA Engineering feature

# 2
Scenario Outline: Positive Test functionality
Given user launch the browser
When user lands on the home page
Then user clicks on courses feature
And clicks on dropdown arrow
Then clicks QA Engineering feature
And QA Engineering application displayed
Then user add valid"<firstname>"and"<lastname>"
Then add "<email>"
And user add "<phone>" and "<state>"
Then clicks on submit button

Examples:
 |firstname |lastname |email            |phone       |state  |
 |Tom       |TM       |test123@gmail.com|123-456-7890|newyork|
 
 # 3
Scenario Outline: Positive Test functionality
Given user launch the browser
When user lands on the home page
Then user clicks on courses feature
And clicks on dropdown arrow
Then clicks QA Engineering feature
And QA Engineering application displayed
Then user add invalid"<firstname>"and"<lastname>"
Then add "<email>"
And user add "<phone>" and "<state>"
And submit button is clickable
 Examples:
 |firstname |lastname |email            |phone       |state  |
 |Tommy     |Tmy      |test123@gmail.com|123-456-7890|newyork|
 
 # 4
Scenario Outline: Negative Test functionality
Given user launch the browser
When user lands on the home page
Then user clicks on courses feature
And clicks on dropdown arrow
Then clicks QA Engineering feature
And QA Engineering application displayed
Then user add invalid"<firstname>"and"<lastname>"
Then add invalid"<email>"
And user add "<phone>" and "<state>"
And submit button is not clickable
And gets error message

Examples:
 |firstname |lastname |email            |phone       |state  |
 |Thomas    |Tho      |test123gmail.com |123-456-7890|newyork|
 |Thomas    |Tho      |test123@gmail.com|1234567890  |newyork|

# 5 
 Scenario Outline: Negative Test functionality
Given user launch the browser
When user lands on the home page
Then user clicks on courses feature
And clicks on dropdown arrow
Then clicks QA Engineering feature
And QA Engineering application displayed
Then user add valid"<firstname>"and"<lastname>"
Then add "<email>"
And user add invalid "<phone>" and valid "<state>"
And submit button is not clickable
And gets error message under phone field

