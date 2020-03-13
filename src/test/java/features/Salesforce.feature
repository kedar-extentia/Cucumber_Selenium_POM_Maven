# Salesforce feature
# Tags: optional

Feature: Salesforce Features Tests

  @debugSF
  Scenario: Verify SF Login scenario
    Given I launch SF login URL
    When I login as Automation User
	Then Login Successful
    And I navigate to Account
#    When I click New Button
#    Then Account screen loaded with New button
#    And I logout Salesforce

#  @test
#  Scenario: Verify User is able to create Account
#    Given I am on Home screen
#    And I navigate to Account
#    When I click New Button
#    Then Account screen loaded with New button
#    And New button is clickable
#    When I Click on new button
#    Then Account Creation modal displayed with fields as below
#    When I fill details as below
#    And I click Save button
#    Then Account created successfully
#

