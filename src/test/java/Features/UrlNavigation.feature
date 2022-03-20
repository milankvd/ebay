Feature: Navigate to ebay page
  As a user
  i want to search ebay in google then
  open correct ebay page


  Scenario: User should be successfully Navigate to ebay homepage

    Given User should be on Google home page
    When User search ebay in google search bar and press enter
    And User click on correct result of ebay page from search result
    Then User should navigate to ebay homepage
    And user should able to see ebay logo