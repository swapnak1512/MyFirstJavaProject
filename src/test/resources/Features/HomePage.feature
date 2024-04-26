Feature: AutoQuote Home
  @HomePage
  Scenario: Homepage Functionality of Travelers
    Given user is navigated to home page with url "http://travelers.com/"
    When user enters the "06074" zip code and click on starts a quote button
    Then user should be in lets get started page