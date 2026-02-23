Feature: OpenCart MacBook validation POM

  Scenario: Validate MacBook
    Given User navigates to OpenCart homepage
    When User clicks on MacBook product
    Then Product code text should be "Product Code: Product 16"

  Scenario: Validate iPhone
    Given User navigates to OpenCart homepage
    When User clicks on iPhone product
    Then Product code text should be "Product Code: product 11"

  Scenario: Validate Apple Cinema
    Given User navigates to OpenCart homepage
    When User clicks on Apple Cinema product
    Then Product code text should be "Product Code: Product 15"

  Scenario: Validate Cannon EOS
    Given User navigates to OpenCart homepage
    When User clicks on Canon EOS 5D product
    Then Product code text should be "Product Code: Product 3"