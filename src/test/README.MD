**Instructions**:
Using an automation framework of your choice. (Preferably leveraging Cucumber.)

Share a repository with your coding challenge (You should be able to set up a free account on github, bitbucket, sourceforge, etc. to share your coding challenge.)
Name it with your "firstname_lastname_teladoc_challenge"
Update your README to show how to run your scripts
Fulfill the following two scenarios:

**Feature**:
`As an Engr. Candidate`
I need to automate http://www.way2automation.com/angularjs-protractor/webtables/
So I can show my awesome automation skills

**Scenario** : Add a user and validate the user has been added to the table**
**Scenario**: Delete user User Name: novak and validate user has been delete**


I built Cucumber-JUnit framework by Maven: It was a maven project which helped to manage the dependencies.
I used Java language, BDD framework.
Generates HTML REPORTS with all the test steps.
I use the GIT version control for sharing my framework.
Properties File: I used a properties file to store sensitive and reusable data like
URL(environment), browser .
JUnit: I use JUnit testing tool to control flow and assert data.
Singleton Pattern: I created a Driver class in a utility package that uses the
singleton pattern to create and use only one webdriver.
● I used a Cucumber-JUnit framework with Selenium WebDriver.
● To increase code usability and have a more readable framework, I used Page
Object Model as my design pattern to create page objects; store webElements .
● We used Page Factory Design Pattern to instantiate the webElement using
@FindBy annotation which makes it easier and convenient.
● We also had a Utility package where we kept all global and most frequently used
codes such as browser utils.