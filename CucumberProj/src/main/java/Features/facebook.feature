Feature: Facebook login


 @executeThis
  Scenario: login to facebook
    Given user opens browser
    Then user is on login page 	
    Then user enters username and password
   
    Then home page is displayed 
    


  Scenario Outline: facebook login
    Given I am on facebook login page
    When I enter the "<usn>" and "<pwd>"
    Then I click on login
    Then I am on facebook homepage

    Examples: 
      | usn   | pwd   | 
      | bhoomika.16@gmail.com |     baby4321 | 
   