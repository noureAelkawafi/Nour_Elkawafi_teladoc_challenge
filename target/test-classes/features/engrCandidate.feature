Feature: Engineer Candidate

  As a user, I should be able to automate the way2automation web application,
  and I can Add a user, and delete a user .

 #repeating steps for each scenario
  Background:
    Given user is on the webTable page


    # @wip

  Scenario: Add a user to the table

    When  User clicks Add User button
    Then  user should see the add user form
    And   user enter First name
    And   user enter Last name
    And   user enter user Name
    And   user enter password
    And   user  choose from customerCompany radio button
    And   user  choose from Roles list
    And   user enter E-mail
    And   user enter cell Phone number
    Then  user can click on save button
    Then user can see added user


     #@wip


  Scenario: Delete user User Name: novak
    When  user click on the delete button
    And   user click on the ok button
    Then  user should see user has been delete

