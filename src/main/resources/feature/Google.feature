@googleSeacrh
Feature: This will be my Google search feature

  @searchScenario1
  Scenario Outline: My scenario 1
    Given I want to launch google.com
    When I enter text "<name>"
    Then I click on the first link

    Examples: 
      | name  |
      | name1 |
      | name2 |
