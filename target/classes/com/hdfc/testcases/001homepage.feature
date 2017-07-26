Feature: Validating Hdfc Home page

Scenario Outline: Verify HomePage

Given I open "<browser>" browser
When I naviagte to "<url>" url
And I click ccicon and go to ccform page
And select getelegibility page window

Examples:
|browser|url					|
|firefox|http://www.hdfcbank.com/|

