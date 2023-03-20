Feature: nopCommerce Module1 Functionality

  Background: Launch the Nop Commerce Login Page
    Given launch the nop login page

  @Smoke @Regression
  Scenario: nop Login Functionality
    When user enter emailid and password
    When user click on loginBtn
    Then verify login success or not

  @Regression
  Scenario Outline: NopCommerce Login Functionality
    When enter "<UserName>" and "<Password>"
    When click on LoginButton
    Then verify Login success

    Examples: 
      | UserName            | Password   |
      | admin@yourstore.com | admin      |
      | shareef@store.com   | shareef    |
      | nandini@store.com   | nandini123 |

  @Regression
  Scenario: Nop Commerce Login with single data
    When enter values in email field and password field
      | UserName        | Password  |
      | hello@store.com | hello123$ |
    And click on the login button to do login
    Then verify login successfully functionality
