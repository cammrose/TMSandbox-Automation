Feature: TradeMeSandbox Test Suite

  Scenario: Verify the details for an existing book listing
    Given I open to the TradeMe Sandbox landing page
    And I navigate to the books results page
    When I Select a book after a query
    Then I see the books title, listing expiry, price and seller
