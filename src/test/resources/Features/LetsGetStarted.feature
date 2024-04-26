Feature: Travelers - New Customer

  Background: User launches travelers site
    Given user is navigated to home page with url "http://travelers.com/"
    When user enters the "06074" zip code and click on starts a quote button
    Then user should be in lets get started page

  @LetsGetStarted
  Scenario: New customer
    Given user is already LetsGetStarted Page
    When user selects No for Are you currently a Travelers customer?
    And user click on Continue Quote button
    Then new user page should be displayed

 # @LetsGetStarted
#  Scenario: Existing customer
 #   Given user is already LetsGetStarted Page
  #  When user selects "Yes" for Are you currently a Travelers customer?
   # And user click on Continue Quote button
    #Then current customer page should be displayed