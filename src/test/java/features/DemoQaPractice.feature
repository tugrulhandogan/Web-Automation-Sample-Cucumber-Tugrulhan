@DemoQa
Feature: Demo Qa test automation scenarios

  Background: Navigate to the page
  Navigates to the page
    * Navigate to url: https://demoqa.com/automation-practice-form


  @DemoQaTest
  Scenario Outline: Filling Steps
  A Scenario where filling scenario are tested
    * Fill the firstNameInput on the DemoQaPracticePage with text: <firstName>
    * Fill the lastNameInput on the DemoQaPracticePage with text: <lastName>
    * Fill the userEmailInput on the DemoQaPracticePage with text: <userEmail>
    * Select <gender> from DemoQaPracticePage
    * Fill the mobileInput on the DemoQaPracticePage with text: <mobileNumber>
    * Set the dateOfBirthInput on the DemoQaPracticePage with text: '<dateOfBirth>'
    * Fill the subjectsInput on the DemoQaPracticePage with text: <subjects>
    * Press the enter key
    * Select <hobbies> from DemoQaPracticePage
    * Upload <file> from <specifiedDirectory>
    * Fill the currentAddressInput on the DemoQaPracticePage with text: <currentAddress>
    * Select a state <state>
    * Select a city <city>
    * Scroll to submit button
    * Click the submitButton on the DemoQaPracticePage
    * Wait 2 seconds

    Examples:

      | firstName | lastName | userEmail            | gender    | mobileNumber | dateOfBirth | subjects | hobbies | file     | specifiedDirectory                  | currentAddress            | state | city  |
      | Jack      | London   | jacklondon@gmail.com | maleInput | 1234567890   | 05 Nov 2022 | Physics  | reading | Logo.png | C:\Users\Tugrulhan\OneDrive\Desktop | London Street 234, 5435KL | NCR   | Delhi |





