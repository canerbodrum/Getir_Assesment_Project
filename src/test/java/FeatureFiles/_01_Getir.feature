Feature: Navigate to GetirHome Page And Succesfull Login

  Scenario: Navigate to Home Page
    Given Navigate to Getir Home Page
    When Login With Phone Number
    And  Click on the GetirFood
    And Navigate to GetirFoodPromo
    Then Click User Information Button
