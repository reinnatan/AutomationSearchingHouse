@tag
Feature: Search house in jakarta
    Search house in jakarta

    @tag1
    Scenario: Search house on tebet location
    Given browse to rumah123 website
    And search rumah location "Tebet"
    And click button filter
    And click filter house
    And click filter three bedrooms
    Then click apply filter
    When check the result less than 1000