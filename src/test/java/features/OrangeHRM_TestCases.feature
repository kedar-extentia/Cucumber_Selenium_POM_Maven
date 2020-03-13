# Login feature
# Tags: optional

Feature: Login to OrangeHRM site

  @debug
  Scenario: Verify sample Login scenario
    Given I launch OrangeHRM URL
    And I login OrangeHRM as user "opensourcecms" and password "opensourcecms"
#    And I logout

  @debug
  Scenario: Verify Time Setting functionality
    Given I am on OrangeHRM Dashboard
    And I navigate to Performance KPI List
    And I logout
#    And I logout and close the browser



#  @debug
#  Scenario: Verify Login from .properties feed file
#    Given I launch OrangeHRM URL
#    And I login OrangeHRM as User from data file
#    And I logout
#
#  @Complete @smoke
#  Scenario Outline: Verify user is able to login successfully
#    Given I launch OrangeHRM URL
#    And I login OrangeHRM with <username> and <password>
#    Examples:
#      | username      | password      |
#      | opensourcecms | opensourcecms |
#
