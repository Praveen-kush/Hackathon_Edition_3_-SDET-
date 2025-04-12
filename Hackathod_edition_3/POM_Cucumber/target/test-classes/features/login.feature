Feature: Login functionality validation on the-internet.herokuapp.com

  Scenario: Successful login with valid credentials
    Given User is on Login Page
    When User enters username "tomsmith" and password "SuperSecretPassword!"
    And clicks the login button
    Then User should see a success message "You logged into a secure area!"

  Scenario Outline: Login failure with invalid credentials
    Given User is on Login Page
    When User enters username "<username>" and password "<password>"
    And clicks the login button
    Then User should see an error message "<message>"

    Examples:
      | username   | password            | message                        |
      | wronguser  | SuperSecretPassword!| Your username is invalid!      |
      | tomsmith   | wrongpassword       | Your password is invalid!      |
      | wronguser  | wrongpassword       | Your username is invalid!      |

  Scenario: Login attempt with blank fields
    Given User is on Login Page
    When User enters username "" and password ""
    And clicks the login button
    Then User should see an error message "Your username is invalid!"
