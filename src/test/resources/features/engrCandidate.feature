Feature: Engineer Candidate

  As a user, I should be able to automate the way2automation web application,
  and I can Add a user, and delete a user .

  Background:
    Given user is on the webTable page

 @wip

  Scenario: Add a user to the table

    When  User clicks Add User button
    Then  user should see the add user form
    And   user enters First name
    And   user enters Last name
    And   user enters user Name
    And   user enters password
    And   user  choose from customerCompany radio button
    And   user  choose from Roles list
    And   user enters E-mail
    And   user enters cell Phone number
    Then  user can click on save button
    Then user can see added user


#@wip


  Scenario: Delete user User Name: novak
    When  user click on the delete button
    And   user click on the ok button
    Then  user should see user has been delete

