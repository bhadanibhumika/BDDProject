Feature: refer Product to a Friend
  @referProduct
  Scenario: As a Registered user,I Should Able To refer A Product To Friend Successfully
    so that they can purchase it
    Given I am a registered user
    And I am logged in to my account
    And I am on the homepage page
    When I click on digital downloads
    And I click on LONDON GRAMMAR add to cart button
    And I am on product page
    When I click on the Email A friend button
    Then Email a friend page should appear
    And I enter Friend Email details
    And I click on Send Email
    Then A successfully sent email message should be displayed