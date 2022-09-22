@tag
Feature: Search Java Developer Jobs
    Search Java Developer Jobs

    @tag1
    Scenario: Search Job java developer in jobstreet
    Given Open the browser
    And Click Country "Singapore"
    When search "java developer"
    Then showing the result jobs