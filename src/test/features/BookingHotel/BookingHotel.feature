Feature: Booking Hotel

  Scenario: Booking Hotel which are desired
    Given Open the chrome launch the application and login page
    When User Input Location SelectHotel CheckInDate CheckOutDate
    And user input address and save address
    Then user proceed to checkout