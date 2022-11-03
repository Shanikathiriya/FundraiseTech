
Feature: Find cause
  As a user, I want Go to the link ‘Find a Cause’ on the top of the page
  Enter 3 characters in the Search field - Select the 3rd cause from the suggestion list
  Click Search cause I can use all user features

@Findcause
  Scenario: User should able to find cause successfully

    Given user is on home page
   When user click on find cause enter char

  And select 3rd cause from list and click
   Then user should Confirm with a message that the selected 3rd Cause exists in the Search results

