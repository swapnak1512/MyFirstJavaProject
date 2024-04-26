Feature: Travelers - New Customer Page

  Background: User launches travelers site
    Given user is navigated to home page with url "http://travelers.com/"
    When user enters the "06074" zip code and click on starts a quote button
    Then user should be in lets get started page

    Given user is already LetsGetStarted Page
    When user selects No for Are you currently a Travelers customer?
    And user click on Continue Quote button
    Then new user page should be displayed

  @NewCustomer
  Scenario: New customer Page
    Given user is already New Customer Page
    When user enters all mandatory fields
    And user click on Yes start Quote button
    Then Tell us page should be displayed