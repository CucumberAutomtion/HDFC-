Feature: Validate super bike page

Scenario Outline: verify super bike page
Given I enter "<name>" in the name field
When I enter "<mobile>" in the mobile field
And I enter "<email>" in the email field
And I click on submit 

Examples: 
|name	|mobile|email|
|naveen|7809772051|naveen@gmail.com|